package com.rizwanmushtaq.services;

import com.rizwanmushtaq.entities.Category;

import java.util.List;

public interface CategoryService {
  Category saveCategory(Category Category);

  Category updateCategory(Category Category, int CategoryId);

  Category deleteCategory(int CategoryId);

  List<Category> getAllCategorys();

  Category getCategoryById(int CategoryId);
}
