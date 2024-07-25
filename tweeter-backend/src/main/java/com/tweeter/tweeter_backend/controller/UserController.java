package com.tweeter.tweeter_backend.controller;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.tweeter.tweeter_backend.model.User;
import com.tweeter.tweeter_backend.service.UserService;

@RestController("/api/user")
public class UserController {

  UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }

  @GetMapping("/id/{id}")
  private Optional<User> getUserById(@PathVariable Integer id) {
    return this.userService.getUserById(id);
  }

  @GetMapping("/username/{username}")
  private Optional<User> getUserById(@PathVariable String username) {
    return this.userService.getUserByUsername(username);
  }

}
