package com.casso.admintool.rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.casso.admintool.rest.entities.User;

import com.casso.admintool.rest.repositories.UserRepository;

import java.util.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/users")
public class UserController {
  @PersistenceContext
  private EntityManager em;
  @Autowired
  UserRepository userRepository;

  @GetMapping()
  public List<User> getUsers() {
    return userRepository.findAll();
  }

  @GetMapping("/login")
  public String login(String email, String password_hash) {
    return String.format("users/login");
  }
}
