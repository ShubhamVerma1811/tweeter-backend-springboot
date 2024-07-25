package com.tweeter.tweeter_backend.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tweeter.tweeter_backend.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

  Optional<User> findUserByUsername(String username);

}
