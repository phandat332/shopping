package DANHHT.Fashion.service.impl;

import DANHHT.Fashion.model.Category;
import DANHHT.Fashion.repository.ICategoryRepository;
import DANHHT.Fashion.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private ICategoryRepository iCategoryRepository;
    @Override
    public List<Category> getAllCategory()
    {
        return iCategoryRepository.findAll();
    }
    @Override
    public void saveCategory(Category category){
      this.iCategoryRepository.save(category);
    }
    @Override
    public Category getCategoryById(long id){
        Optional<Category> optional = iCategoryRepository.findById(id);
        if(optional.isPresent())
        {
            return optional.get();
        } else {
            throw new RuntimeException("Category not found for id " + id);
        }
    }

    @Override
    public void deleteCategoryById(long id){
        this.iCategoryRepository.deleteById(id);
    }
}
