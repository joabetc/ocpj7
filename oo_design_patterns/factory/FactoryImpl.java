public class FactoryImpl extends Factory {
  public BookDao createDao() {
    return new InMemoryBookDao();
  }
}
