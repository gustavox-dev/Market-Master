package com.example.Market.Master.service;

import com.example.Market.Master.domain.User;
import com.example.Market.Master.dto.UserResponseDTO;
import com.example.Market.Master.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public UserResponseDTO createUser(User user){
        User newUser = new User();
        newUser.setUserName(user.getUsername());
        newUser.setPassword(user.getPassword());
        newUser.setName(user.getName());

        repo.save(newUser);

        return new UserResponseDTO(newUser.getName(), newUser.getUsername(), newUser.getPassword());
    }

    public List<User> findAll(){
        return repo.findAll();
    }
}
