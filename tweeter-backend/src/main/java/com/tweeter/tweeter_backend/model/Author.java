package com.tweeter.tweeter_backend.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(uniqueConstraints = {
    @UniqueConstraint(columnNames = "email"),
    @UniqueConstraint(columnNames = "username")
}, indexes = {
    @Index(columnList = "username")
})
@Getter
@Setter
@NoArgsConstructor
public class Author {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private Integer id;

  private String bio;

  @Column(nullable = false)
  private String email;

  @Column(nullable = false)
  private String name;

  @Column(nullable = false)
  private String username;

  private String profilePicture;

  @JsonManagedReference
  @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
  private List<Tweet> tweets;
}