package com.rizwanmushtaq.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "laptops")
public class Laptop {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private String brand;
  private String model;
  @OneToOne
  private Student student;

  public Student getStudent() {
    return student;
  }

  public void setStudent(Student student) {
    this.student = student;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  @Override
  public String toString() {
    return "Laptop{" +
        "id=" + id +
        ", brand='" + brand + '\'' +
        ", model='" + model + '\'' +
        '}';
  }
}
