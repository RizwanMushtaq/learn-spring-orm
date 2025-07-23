package com.rizwanmushtaq.services.impl;

import com.rizwanmushtaq.entities.Laptop;
import com.rizwanmushtaq.repositories.LaptopRepository;
import com.rizwanmushtaq.services.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopServiceImpl implements LaptopService {
  @Autowired
  private LaptopRepository laptopRepository;

  @Override
  public Laptop saveLaptop(Laptop laptop) {
    return laptopRepository.save(laptop);
  }

  @Override
  public Laptop updateLaptop(Laptop laptop, int laptopId) {
    Laptop existingLaptop = laptopRepository.findById(laptopId)
        .orElseThrow(() -> new RuntimeException("Laptop not found with id: " + laptopId));
    existingLaptop.setBrand(laptop.getBrand());
    existingLaptop.setModel(laptop.getModel());
    return laptopRepository.save(existingLaptop);
  }

  @Override
  public Laptop deleteLaptop(int laptopId) {
    Laptop laptop = laptopRepository.findById(laptopId)
        .orElseThrow(() -> new RuntimeException("Laptop not found with id: " + laptopId));
    laptopRepository.delete(laptop);
    return laptop;
  }

  @Override
  public List<Laptop> getAllLaptops() {
    return laptopRepository.findAll();
  }

  @Override
  public Laptop getLaptopById(int laptopId) {
    return laptopRepository.findById(laptopId)
        .orElseThrow(() -> new RuntimeException("Laptop not found with id: " + laptopId));
  }
}
