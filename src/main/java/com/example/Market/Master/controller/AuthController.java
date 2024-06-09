package com.example.Market.Master.controller;

import com.example.Market.Master.domain.User;
import com.example.Market.Master.dto.LoginRequestDTO;
import com.example.Market.Master.dto.RegisterRequestDTO;
import com.example.Market.Master.dto.ResponseLoginDTO;
import com.example.Market.Master.enums.UserRole;
import com.example.Market.Master.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private static final Logger LOG = LoggerFactory.getLogger(AuthController.class);

    @Autowired
    private UserRepository repository;

    @Autowired
    private AuthenticationManager authenticationManager;

    @PostMapping("/login")
    public ResponseEntity<ResponseLoginDTO> login(@RequestBody LoginRequestDTO body){
        LOG.info("::: User {} successfully logged in ::: ", body.userName());

        var userNamePassword = new UsernamePasswordAuthenticationToken(body.userName(), body.password());
        var auth = this.authenticationManager.authenticate(userNamePassword);

        return ResponseEntity.ok().build();
    }

    @PostMapping("/register")
    public ResponseEntity<ResponseLoginDTO> register(@RequestBody RegisterRequestDTO body){
        if(this.repository.findByUserName(body.userName()) != null) return ResponseEntity.badRequest().build();

        String encryptedPassword = new BCryptPasswordEncoder().encode(body.password());
        User newUser = User.builder()
                .name(body.name())
                .userName(body.userName())
                .password(encryptedPassword)
                .role(UserRole.valueOf(body.role()))
                .build();

        this.repository.save(newUser);

        LOG.info("::: User {} successfully register in ::: ", body.userName());
        return ResponseEntity.ok().build();
    }
}
