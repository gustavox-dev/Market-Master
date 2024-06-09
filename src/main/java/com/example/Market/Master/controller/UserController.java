package com.example.Market.Master.controller;

import com.example.Market.Master.domain.User;
import com.example.Market.Master.dto.UserResponseDTO;
import com.example.Market.Master.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping
    public UserResponseDTO createUser(@RequestBody User user){
        return service.createUser(user);
    }

    @GetMapping
    public List<User> findAll(){
        return service.findAll();
    }
}
