package com.casso.admintool.rest.controllers;

import com.casso.admintool.rest.repositories.UserRepository;
import com.casso.admintool.rest.repositories.DTO.Auth;

import org.springframework.web.bind.annotation.*;

import antlr.collections.List;

import com.casso.admintool.rest.entities.User;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "*")
public class AuthController {
    private UserRepository userRepository;
    @PostMapping("/login")
    public Auth login( @RequestBody Auth auth) {

        System.out.println(auth.getEmail());
        System.out.println(auth.getPasswordHash());
        // java.util.List<User> user = userRepository.login(auth.getEmail(),auth.getPasswordHash());
        // System.out.println(auth.getDeviceId());
        return auth;
    }
}
