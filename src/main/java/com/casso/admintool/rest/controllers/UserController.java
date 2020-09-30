package com.casso.admintool.rest.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

  @GetMapping("/login")
  public String login() {
    return String.format("login");
  }
}
