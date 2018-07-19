public class FactoryImpl extends Factory {
  public BookDao createDao() {
    if (Util.isTestMode()) {
      return new InMemoryBookDao();
    } else {
      return new OracleBookDao();
    }    
  }
}
