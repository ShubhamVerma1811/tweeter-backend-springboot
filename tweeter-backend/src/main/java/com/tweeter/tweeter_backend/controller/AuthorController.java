package com.tweeter.tweeter_backend.controller;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.tweeter.tweeter_backend.model.Author;
import com.tweeter.tweeter_backend.service.AuthorService;

@RestController("/api/user")
public class AuthorController {

  AuthorService userService;

  public AuthorController(AuthorService userService) {
    this.userService = userService;
  }

  @GetMapping("/id/{id}")
  private Optional<Author> getUserById(@PathVariable Integer id) {
    return this.userService.getUserById(id);
  }

  @GetMapping("/username/{username}")
  private Optional<Author> getUserById(@PathVariable String username) {
    return this.userService.getUserByUsername(username);
  }

}
