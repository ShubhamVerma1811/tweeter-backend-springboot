package com.tweeter.tweeter_backend.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.tweeter.tweeter_backend.model.Author;
import com.tweeter.tweeter_backend.repo.AuthorRepo;

@Service
public class AuthorService {
  AuthorRepo authorRepo;

  private AuthorService(AuthorRepo authorRepo) {
    this.authorRepo = authorRepo;
  }

  // public List<Author> getAllAuthors() {
  // return this.authorRepo.findAll();
  // }

  public Optional<Author> getUserById(Integer id) {
    return this.authorRepo.findById(id);

  }

  public Optional<Author> getUserByUsername(String username) {
    return this.authorRepo.findUserByUsername(username);
  }

  public Author createAuthor(Author author) {
    return this.authorRepo.save(author);
  }

  public Author updateAuthor(Author author) {
    return this.authorRepo.save(author);
  }

  // TODO:: verify status
  public void deleteAuthorById(Integer id) {
    this.authorRepo.deleteById(id);
  }

}
