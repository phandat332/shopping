package DANHHT.Fashion.service;

import DANHHT.Fashion.model.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAllCategory();
    void saveCategory(Category category);
    Category getCategoryById(long id);
    void deleteCategoryById(long id);
}
