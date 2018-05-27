interface Cookable {
  public void cook();
}

class Food {
  Cookable c = new Cookable() {
    public void cook() {
      System.out.println("Anonymous cookable implementer");
    }
  };
}
