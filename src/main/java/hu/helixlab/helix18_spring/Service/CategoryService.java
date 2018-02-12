package hu.helixlab.helix18_spring.Service;

import hu.helixlab.helix18_spring.Domain.Category;
import hu.helixlab.helix18_spring.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public Iterable<Category> getAll() {
        return categoryRepository.findAll();
    }
}
