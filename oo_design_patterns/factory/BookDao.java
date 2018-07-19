import java.util.*;

public interface BookDao {
  Collection<Book> findAllBooks();
  Book findBookByIsbn(Book book);
  void create(Book book);
  void delete(Book book);
  void update(Book book);
}
