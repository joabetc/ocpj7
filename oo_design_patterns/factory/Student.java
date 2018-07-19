public class Student {
  public static void main(String[] args) {
    Factory factory = new FactoryImpl();
    BookDao dao = factory.createDao();
    Book book = new Book();
    book.setTitle("Book");
    book.setAuthor("John");
    book.setIsbn("PAC-18-26041945-2168673");
    dao.create(book);
    book.setTitle("Updated");
    dao.update(book);
    dao.delete(book);
  }
}
