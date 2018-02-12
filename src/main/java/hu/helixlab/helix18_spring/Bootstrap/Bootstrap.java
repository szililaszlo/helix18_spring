package hu.helixlab.helix18_spring.Bootstrap;

import hu.helixlab.helix18_spring.Domain.Author;
import hu.helixlab.helix18_spring.Domain.Book;
import hu.helixlab.helix18_spring.Domain.Category;
import hu.helixlab.helix18_spring.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.UUID;

//ez az egész osztály a program lefutása után automatikusan lefut, tehát lesznek példák most az adatbázisban

@Component
public class Bootstrap implements ApplicationListener<ContextRefreshedEvent>{

    @Autowired
    private BookRepository bookRepository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        init();
    }

    private void init() {
        Book book = new Book();
        book.setIsbn(String.valueOf(UUID.randomUUID()));
        book.setName("Java Course I.");

        Category category = new Category();
        category.setName("Horror");
        category.setShortDescription("Very scary books for brave men");

        book.addCategory(category);

        Author author = new Author();
        author.setName("Béla");
        author.setAge(32);
        author.setEmail("a@a.hu");

        book.addAuthor(author);
        bookRepository.save(book);
    }
}
