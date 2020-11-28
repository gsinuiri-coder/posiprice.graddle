package com.silverfoxmedia.product.domain.service;

import com.silverfoxmedia.product.domain.model.Category;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CategoryService {
    List<Category> getAllCategories();
    Category getCategoryById(Long categoryId);
    Category createCategory(Category category);
    Category updateCategory(Long categoryId, Category categoryRequest);
    ResponseEntity<?> deleteCategory(Long categoryId);
}
