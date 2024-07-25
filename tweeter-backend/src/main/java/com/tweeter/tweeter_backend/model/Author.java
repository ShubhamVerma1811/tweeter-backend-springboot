package com.tweeter.tweeter_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Author {
  @Id
  Integer id;
  String bio;
  String email;
  String name;
  String username;
  String profilePicture;

  public Author() {
  }

  public Author(Integer id, String bio, String email, String name, String username, String profilePicture) {
    this.id = id;
    this.bio = bio;
    this.email = email;
    this.name = name;
    this.username = username;
    this.profilePicture = profilePicture;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getBio() {
    return bio;
  }

  public void setBio(String bio) {
    this.bio = bio;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getProfilePicture() {
    return profilePicture;
  }

  public void setProfilePicture(String profilePicture) {
    this.profilePicture = profilePicture;
  }

}
