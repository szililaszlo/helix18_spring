package hu.helixlab.helix18_spring.Controller;

import hu.helixlab.helix18_spring.Domain.Category;
import hu.helixlab.helix18_spring.Repository.CategoryRepository;
import hu.helixlab.helix18_spring.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/category")
public class CategoryRestController {

    @Autowired
    CategoryService categoryService;

    @RequestMapping(value = "/categories", method = RequestMethod.GET)
    public Iterable<Category> findAll() {
        return categoryService.getAll();
    }
}
