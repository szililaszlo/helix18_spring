package hu.helixlab.helix18_spring.Service;

import hu.helixlab.helix18_spring.Domain.Book;
import hu.helixlab.helix18_spring.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public Book findById(int id) {

        return bookRepository.findOne(id);

    }

    public Book save(Book book) {

        return bookRepository.save(book);
    }

    public void deleteById(int id) {

        bookRepository.delete(id);
    }

    public Book updateById(int id,Book newBook) {
        Book oldBook = bookRepository.findOne(id);
        oldBook.setName(newBook.getName());
        oldBook.setIsbn(newBook.getIsbn());

        return  bookRepository.save(oldBook);
    }

    public Book getTestBook() {
        Book book = new Book();
        book.setId(1003);
        book.setName("Spring test book");
        book.setIsbn("aaaa-g5ge45");
        return book;
    }
}
