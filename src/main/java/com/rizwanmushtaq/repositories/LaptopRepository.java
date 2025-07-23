package com.rizwanmushtaq.repositories;

import com.rizwanmushtaq.entities.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaptopRepository extends JpaRepository<Laptop, Integer> {
}
