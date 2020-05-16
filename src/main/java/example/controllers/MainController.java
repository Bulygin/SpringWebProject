package example.controllers;

import example.data.BookDao;
import example.entities.Book;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class MainController {

  private BookDao bookDao;

  @GetMapping(value = "/booksList")
  public List<Book> getEmployees() {
    return bookDao.findAll();
  }

  @PostMapping(value = "/createBook")
  public void createBook(@RequestBody Book book) {
    bookDao.insertBook(book);
  }

  @PutMapping(value = "/updateBook")
  public void updateBook(@RequestBody Book book) {
    bookDao.updateBook(book);
  }

  @PutMapping(value = "/executeUpdateBook")
  public void executeUpdateEmployee(@RequestBody Book book) {
    bookDao.executeUpdateBook(book);
  }

  @DeleteMapping(value = "/deleteBookById")
  public void deleteBook(@RequestBody Book book) {
    bookDao.deleteBook(book);
  }
}
