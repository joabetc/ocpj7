public class FactoryImpl extends Factory {
  protected BookDao createDatabaseBookDao() {
    return new OracleBookDao();
  }
  }
}
