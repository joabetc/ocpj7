class MyOuter2 {
  private String x = "Outer2";
  void doStuff() {
    class MyInner {
      public void seeOuter() {
        System.out.println("Outer x is " + x);
      }
    }

    MyInner mi = new MyInner();
    mi.seeOuter();
  }
}
