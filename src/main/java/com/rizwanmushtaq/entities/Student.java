package com.rizwanmushtaq.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "students")
public class Student {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private String name;
  private String email;
  @OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
  private Laptop laptop;
  @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
  private List<Address> addressList = new ArrayList<>();

  public Laptop getLaptop() {
    return laptop;
  }

  public void setLaptop(Laptop laptop) {
    this.laptop = laptop;
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

  @Override
  public String toString() {
    return "Student{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", email='" + email + '\'' +
        '}';
  }
}
