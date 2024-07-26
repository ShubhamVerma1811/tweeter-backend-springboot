package com.tweeter.tweeter_backend.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tweeter.tweeter_backend.model.Tweet;

@Repository
public interface TweetRepo extends JpaRepository<Tweet, Integer> {
  public List<Tweet> findTweetsByAuthorId(Integer authorId);

}
