class MyOuter {
  private int x = 7;

  class MyInner {
    public void seeOuter() {
      System.out.println("Outer x is " + x);
    }
  }
}
