package example.controllers;

import example.data.BookRepo;
import example.domain.Book;
import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("book")
public class BookController {

  private final BookRepo bookRepo;

  @Autowired
  public BookController(BookRepo messageRepo) {
    this.bookRepo = messageRepo;
  }

  @GetMapping
  public List<Book> list() {
    return bookRepo.findAll();
  }

  @GetMapping("{id}")
  public Book getOne(@PathVariable("id") Book message) {
    return message;
  }

  @PostMapping
  public Book create(@RequestBody Book message) {
    return bookRepo.save(message);
  }

  @PutMapping("{id}")
  public Book update(@PathVariable("id") Book bookFromDb, @RequestBody Book book) {
    BeanUtils.copyProperties(book, bookFromDb, "id");

    return bookRepo.save(bookFromDb);
  }

  @DeleteMapping("{id}")
  public void delete(@PathVariable("id") Book book) {
    bookRepo.delete(book);
  }
}
