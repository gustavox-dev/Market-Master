package com.example.Market.Master.enums;

import com.example.Market.Master.domain.User;

public enum UserRole {

    ADMIN("ADMIN"),
    USER("USER");


    private String role;

    UserRole(String role){
        this.role = role;
    }

    public String getRole(){
        return role;
    }
}
