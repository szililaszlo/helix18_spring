package hu.helixlab.helix18_spring.Repository;

import hu.helixlab.helix18_spring.Domain.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book,Integer>{

}
