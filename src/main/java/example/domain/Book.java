package example.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "Books")
@ToString(of = {"id", "title", "author"})
@EqualsAndHashCode(of = {"id"})
@NoArgsConstructor(force = true)
public class Book {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "ID")
  private long id;

  @Column(name = "Title", nullable = false, insertable = true, updatable = true)
  private String title;

  @Column(name = "Author", nullable = false, insertable = true, updatable = true)
  private String author;

  public Book(String name, String author) {
    this.title = name;
    this.author = author;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }
}
