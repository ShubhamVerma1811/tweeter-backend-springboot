package com.tweeter.tweeter_backend.controller;

import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweeter.tweeter_backend.model.Author;
import com.tweeter.tweeter_backend.service.AuthorService;

@RestController
@RequestMapping("/api/author")
public class AuthorController {

  AuthorService authorService;

  public AuthorController(AuthorService authorService) {
    this.authorService = authorService;
  }

  // @GetMapping("/")
  // private List<Author> getAllAuthors() {
  // return this.authorService.getAllAuthors();
  // }

  @GetMapping("/id/{id}")
  protected Optional<Author> getUserById(@PathVariable Integer id) {
    return this.authorService.getUserById(id);
  }

  @GetMapping("/username/{username}")
  private Optional<Author> getUserById(@PathVariable String username) {
    return this.authorService.getUserByUsername(username);
  }

  @PostMapping("/")
  private Author createAuthor(@RequestBody Author author) {
    return this.authorService.createAuthor(author);
  }

  @PutMapping("/")
  public Author updateAuthor(@RequestBody Author author) {
    return this.authorService.updateAuthor(author);
  }

  @DeleteMapping("/id/{id}")
  public void deleteAuthor(@PathVariable Integer id) {
    this.authorService.deleteAuthorById(id);
  }

}
