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

import com.tweeter.tweeter_backend.model.Tweet;
import com.tweeter.tweeter_backend.service.TweetService;

@RestController
@RequestMapping("/api/tweet")
public class TweetController {

  TweetService tweetService;

  public TweetController(TweetService tweetService) {
    this.tweetService = tweetService;
  }

  @GetMapping("/{id}")
  private Optional<Tweet> getTweetById(@PathVariable Integer id) {
    return this.tweetService.getTweetById(id);
  }

  @PostMapping("/")
  private Tweet createTweet(@RequestBody Tweet tweet) {
    return this.tweetService.createTweet(tweet);
  }

  @PutMapping("/")
  public Tweet updateTweet(@RequestBody Tweet tweet) {
    return this.tweetService.updateTweet(tweet);
  }

  @DeleteMapping("/id/{id}")
  public void deleteTweet(@PathVariable Integer id) {
    this.tweetService.deleteTweetById(id);
  }

}
