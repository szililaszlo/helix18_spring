package hu.helixlab.helix18_spring.Service;

import hu.helixlab.helix18_spring.Domain.Book;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    public Book getTestBook() {
        Book book = new Book();
        book.setId(1003);
        book.setName("Spring test book");
        book.setIsbn("aaaa-g5ge45");
        return book;
    }
}
