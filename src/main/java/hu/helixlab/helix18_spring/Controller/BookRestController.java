package hu.helixlab.helix18_spring.Controller;

import hu.helixlab.helix18_spring.Domain.Book;
import hu.helixlab.helix18_spring.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/books") //ha itt rárakjuk akkor a többi helyen már nem kell
public class BookRestController {

    @Autowired
    private BookService bookService;

    @RequestMapping(/*value = "/books",*/ method = RequestMethod.POST)
    public Book createBook(@RequestBody Book book){

    return bookService.save(book);
    }

   // PathVariable vs RequestParam különbség megtanulása
    @RequestMapping (value = "/{id}", method = RequestMethod.GET)
    public Book findById(@PathVariable("id") int id) {
        return bookService.findById(id);
    }

    @RequestMapping(value ="/{id}",method = RequestMethod.DELETE)
    public void deleteBookById(@PathVariable("id") int id) {
        bookService.deleteById(id);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public Book updateBookById(@PathVariable("id")int id, @RequestBody Book book) {
      return bookService.updateById(id,book);
    }

    @RequestMapping(value = "/allbooks", method = RequestMethod.GET)
    public Iterable<Book> findAll() {
        return bookService.getAll();
    }
    //findAll
    //angular alkalmazás amivel ezeket az url-eket lehet hívin, fussanak a metódusok, nem futhat ugyanazon a porton mind2
    //Restcontrollernél kell @CrossOrigin annotcáió, minden metódusra
}
