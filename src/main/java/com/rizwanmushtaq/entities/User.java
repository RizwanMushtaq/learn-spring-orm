package com.rizwanmushtaq.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "USER_ID")
  private int id;
  @Column(name = "USER_NAME", length = 100)
  private String name;
  @Column(name = "USER_EMAIL", length = 100)
  private String email;
  @Column(name = "USER_CITY", length = 100)
  private String city;
  @Column(name = "USER_AGE", length = 2)
  private int age;

  public User() {
  }

  public User(int id, String name, String email, String city, int age) {
    this.id = id;
    this.name = name;
    this.email = email;
    this.city = city;
    this.age = age;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "User{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", email='" + email + '\'' +
        ", city='" + city + '\'' +
        ", age=" + age +
        '}';
  }
}
