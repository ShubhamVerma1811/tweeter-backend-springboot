package com.tweeter.tweeter_backend.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.tweeter.tweeter_backend.model.User;
import com.tweeter.tweeter_backend.repo.UserRepo;

@Service
public class UserService {
  UserRepo userRepo;

  public UserService(UserRepo userRepo) {
    this.userRepo = userRepo;
  }

  public Optional<User> getUserById(Integer id) {
    return this.userRepo.findById(id);
  }

  public Optional<User> getUserByUsername(String username) {
    return this.userRepo.findUserByUsername(username);
  }

}
