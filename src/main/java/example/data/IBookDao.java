package example.data;

import example.entities.Book;
import java.util.List;

public interface IBookDao {

  List<Book> findAll();

  void insertBook(Book book);

  void updateBook(Book emp);

  void executeUpdateBook(Book book);

  void deleteBook(Book book);
}

