package com.tweeter.tweeter_backend.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tweeter.tweeter_backend.model.Author;

@Repository
public interface AuthorRepo extends JpaRepository<Author, Integer> {

  Optional<Author> findUserByUsername(String username);

}
