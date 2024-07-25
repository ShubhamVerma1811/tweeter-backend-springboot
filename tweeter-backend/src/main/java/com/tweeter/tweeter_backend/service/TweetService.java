package com.tweeter.tweeter_backend.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.tweeter.tweeter_backend.model.Tweet;
import com.tweeter.tweeter_backend.repo.TweetRepo;

@Service
public class TweetService {
  TweetRepo TweetRepo;

  public TweetService(TweetRepo TweetRepo) {
    this.TweetRepo = TweetRepo;
  }

  public Optional<Tweet> getTweetById(Integer id) {
    return this.TweetRepo.findById(id);
  }

}
