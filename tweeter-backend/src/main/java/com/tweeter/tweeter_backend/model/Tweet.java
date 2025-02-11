package com.tweeter.tweeter_backend.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Tweet {
  @Id
  @GeneratedValue
  private Integer id;
  private String text;
  // private Tweet parentTweet; // Changed to Tweet type
  private Date createdAt = new Date();

  @JsonBackReference
  @ManyToOne
  @JoinColumn(name = "authorId")
  private Author author;
}
