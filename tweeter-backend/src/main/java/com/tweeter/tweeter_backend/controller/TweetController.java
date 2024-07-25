package com.tweeter.tweeter_backend.controller;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.tweeter.tweeter_backend.model.Tweet;
import com.tweeter.tweeter_backend.service.TweetService;

@RestController("/api/tweet")
public class TweetController {

  TweetService TweetService;

  public TweetController(TweetService TweetService) {
    this.TweetService = TweetService;
  }

  @GetMapping("/{id}")
  private Optional<Tweet> getTweetById(@PathVariable Integer id) {
    return this.TweetService.getTweetById(id);
  }

}
