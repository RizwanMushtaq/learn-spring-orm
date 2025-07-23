package com.rizwanmushtaq.services;

import com.rizwanmushtaq.entities.Laptop;

import java.util.List;

public interface LaptopService {
  Laptop saveLaptop(Laptop laptop);

  Laptop updateLaptop(Laptop laptop, int laptopId);

  Laptop deleteLaptop(int laptopId);

  List<Laptop> getAllLaptops();

  Laptop getLaptopById(int laptopId);
}
