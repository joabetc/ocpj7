import java.util.*;

public class InMemoryBookDao {

  private static Map<String, Book> bookstore =
      new HashMap<String, Book>();

    public Collection<Book> findAllBooks() {
      return bookstore.values();
    }

    public Book findBookByIsbn(Book book) {
      return bookstore.get(book.getIsbn());
    }

    public void create(Book book) {
      bookstore.put(book.getIsbn(), book);
    }

    public void delete(Book book) {
      bookstore.remove(book.getIsbn());
    }

    public void update() {
      // no operation - for an in-memory database
      // we update automatically
    }

}
