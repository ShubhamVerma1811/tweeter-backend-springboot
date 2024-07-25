package com.tweeter.tweeter_backend.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

// TODO:: normalize modeling
@Entity
public class Tweet {
  @Id
  Integer id;
  String text;
  String parentTweet;
  Date createdAt;
  // TODO:: secondary key
  String authorId;

}
