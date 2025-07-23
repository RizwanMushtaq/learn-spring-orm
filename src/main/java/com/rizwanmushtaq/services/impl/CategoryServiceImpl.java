package com.rizwanmushtaq.services.impl;

import com.rizwanmushtaq.entities.Category;
import com.rizwanmushtaq.repositories.CategoryRepository;
import com.rizwanmushtaq.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CategoryServiceImpl implements CategoryService {
  @Autowired
  private CategoryRepository categoryRepository;

  @Override
  public Category saveCategory(Category category) {
    return categoryRepository.save(category);
  }

  @Override
  public Category updateCategory(Category category, int categoryId) {
    Category existingCategory = categoryRepository.findById(categoryId)
        .orElseThrow(() -> new RuntimeException("Category not found with id: " + categoryId));
    existingCategory.setName(category.getName());
    return categoryRepository.save(existingCategory);
  }

  @Override
  public Category deleteCategory(int categoryId) {
    Category category = categoryRepository.findById(categoryId)
        .orElseThrow(() -> new RuntimeException("Category not found with id: " + categoryId));
    categoryRepository.delete(category);
    return category;
  }

  @Override
  public List<Category> getAllCategorys() {
    return categoryRepository.findAll();
  }

  @Override
  public Category getCategoryById(int categoryId) {
    return categoryRepository.findById(categoryId)
        .orElseThrow(() -> new RuntimeException("Category not found with id: " + categoryId));
  }
}
