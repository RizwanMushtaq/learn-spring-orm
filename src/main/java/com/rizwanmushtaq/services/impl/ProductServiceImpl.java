package com.rizwanmushtaq.services.impl;

import com.rizwanmushtaq.entities.Product;
import com.rizwanmushtaq.repositories.ProductRepository;
import com.rizwanmushtaq.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
  @Autowired
  private ProductRepository productRepository;

  @Override
  public Product saveProduct(Product product) {
    return productRepository.save(product);
  }

  @Override
  public Product updateProduct(Product product, int productId) {
    Product existingProduct = productRepository.findById(productId)
        .orElseThrow(() -> new RuntimeException("Product not found with id: " + productId));
    existingProduct.setName(product.getName());
    productRepository.save(existingProduct);
    return existingProduct;
  }

  @Override
  public Product deleteProduct(int productId) {
    Product product = productRepository.findById(productId)
        .orElseThrow(() -> new RuntimeException("Product not found with id: " + productId));
    productRepository.delete(product);
    return product;
  }

  @Override
  public List<Product> getAllProducts() {
    return productRepository.findAll();
  }

  @Override
  public Product getProductById(int productId) {
    return productRepository.findById(productId).orElseThrow(() ->
        new RuntimeException("Product not found with id: " + productId));
  }
}
