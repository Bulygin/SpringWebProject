package example.data;

import example.entities.Book;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class BookDao implements IBookDao {

  @Override
  public List<Book> findAll() {
    return null;
  }

  @Override
  public void insertBook(Book book) {

  }

  @Override
  public void updateBook(Book emp) {

  }

  @Override
  public void executeUpdateBook(Book book) {

  }

  @Override
  public void deleteBook(Book book) {

  }
}
