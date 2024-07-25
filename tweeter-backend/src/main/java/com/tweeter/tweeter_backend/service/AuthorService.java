package com.tweeter.tweeter_backend.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.tweeter.tweeter_backend.model.Author;
import com.tweeter.tweeter_backend.repo.AuthorRepo;

@Service
public class AuthorService {
  AuthorRepo userRepo;

  public AuthorService(AuthorRepo userRepo) {
    this.userRepo = userRepo;
  }

  public Optional<Author> getUserById(Integer id) {
    return this.userRepo.findById(id);
  }

  public Optional<Author> getUserByUsername(String username) {
    return this.userRepo.findUserByUsername(username);
  }

}
