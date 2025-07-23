package com.rizwanmushtaq.services;

import com.rizwanmushtaq.entities.Product;

import java.util.List;

public interface ProductService {
  Product saveProduct(Product Product);

  Product updateProduct(Product Product, int ProductId);

  Product deleteProduct(int ProductId);

  List<Product> getAllProducts();

  Product getProductById(int ProductId);
}
