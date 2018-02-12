package hu.helixlab.helix18_spring.Repository;

import hu.helixlab.helix18_spring.Domain.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends CrudRepository<Category,Integer> {
}
