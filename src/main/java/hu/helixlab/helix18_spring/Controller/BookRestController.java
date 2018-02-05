package hu.helixlab.helix18_spring.Controller;

import hu.helixlab.helix18_spring.Domain.Book;
import hu.helixlab.helix18_spring.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/books") //ha itt rárakjuk akkor a többi helyen már nem kell
public class BookRestController {

    @Autowired
    private BookService bookService;

    @RequestMapping(/*value = "/books",*/method = RequestMethod.GET)
    public Book getTestBook() {

        return bookService.getTestBook();
    }

    @RequestMapping(/*value = "/books",*/ method = RequestMethod.POST)
    public void createBook(){

    }
}
