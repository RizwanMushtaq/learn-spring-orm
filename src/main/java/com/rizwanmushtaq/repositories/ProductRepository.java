package com.rizwanmushtaq.repositories;

import com.rizwanmushtaq.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
