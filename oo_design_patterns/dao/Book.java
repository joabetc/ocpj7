import java.util.*;

public class Book {

  private static Map<String, Book> bookstore =
      new HashMap<String, Book>();

  private String isbn;
  private String title;
  private String author;

  public Collection<Book> findAllBooks() {
    return bookstore.values();
  }

  public Book findBookByIsbn(String isbn) {
    return bookstore.get(isbn);
  }

  public void create() {
    bookstore.put(isbn, this);
  }

  public void delete() {
    bookstore.remove(isbn);
  }

  public void update() {
    // no operation - for an in-memory database
    // we update automatically
  }

  public String getIsbn() {
    return this.isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return this.author;
  }

  public void setAuthor() {
    this.author = author;
  }
}
