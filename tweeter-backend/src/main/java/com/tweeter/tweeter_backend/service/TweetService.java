package com.tweeter.tweeter_backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.tweeter.tweeter_backend.model.Tweet;
import com.tweeter.tweeter_backend.repo.TweetRepo;

@Service
public class TweetService {
  TweetRepo tweetRepo;

  public TweetService(TweetRepo TweetRepo) {
    this.tweetRepo = TweetRepo;
  }

  public Optional<Tweet> getTweetById(Integer id) {
    return this.tweetRepo.findById(id);
  }

  public List<Tweet> getTweetsByAuthorId(Integer id) {
    return this.tweetRepo.findTweetsByAuthorId(id);
  }

  public Tweet createTweet(Tweet tweet) {
    return this.tweetRepo.save(tweet);
  }

  public Tweet updateTweet(Tweet tweet) {
    return this.tweetRepo.save(tweet);
  }

  // TODO:: verify status
  public void deleteTweetById(Integer id) {
    this.tweetRepo.deleteById(id);
  }

}
