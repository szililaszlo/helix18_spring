package hu.helixlab.helix18_spring.Repository;

import hu.helixlab.helix18_spring.Domain.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends CrudRepository<Category,Integer> {
    //előre meg vannak ide írva a lekérdezések, pl ez is
    Category findAllById(int id);
}

//azért integer mert ez lesz az id típusa