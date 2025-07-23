package com.rizwanmushtaq.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "addresses")
public class Address {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private String street;
  private String city;
  private String state;
  private String zipCode;
  @ManyToOne
  @JoinColumn(name = "student_id")
  private Student student;

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Student getStudent() {
    return student;
  }

  public void setStudent(Student student) {
    this.student = student;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  @Override
  public String toString() {
    return "Address{" +
        "zipCode='" + zipCode + '\'' +
        ", state='" + state + '\'' +
        ", city='" + city + '\'' +
        ", street='" + street + '\'' +
        ", id=" + id +
        '}';
  }
}
