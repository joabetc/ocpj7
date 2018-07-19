public abstract class Factory {
  public abstract BookDao createDao() {
    if (Util.isTestMode()) {
      return new InMemoryBookDao();
    } else {
      return createDatabaseBookDao();
    }
  }

  protected abstract BookDao createDatabaseBookDao();
}
