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

  public Tweet() {
  }

  public Tweet(Integer id, String text, String parentTweet, Date createdAt, String authorId) {
    this.id = id;
    this.text = text;
    this.parentTweet = parentTweet;
    this.createdAt = createdAt;
    this.authorId = authorId;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public String getParentTweet() {
    return parentTweet;
  }

  public void setParentTweet(String parentTweet) {
    this.parentTweet = parentTweet;
  }

  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public String getAuthorId() {
    return authorId;
  }

  public void setAuthorId(String authorId) {
    this.authorId = authorId;
  }

}
