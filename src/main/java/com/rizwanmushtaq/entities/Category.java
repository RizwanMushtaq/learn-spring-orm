package com.rizwanmushtaq.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Category {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private String name;

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
}
