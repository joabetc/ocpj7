class MyOuter2 {
  private String x = "Outer2";
  void doStuff() {
    class MyInner {
      final String z = "local variable";
      public void seeOuter() {
        System.out.println("Outer x is " + x);
        System.out.println("Local var z is " + z);
      }
    }

    MyInner mi = new MyInner();
    mi.seeOuter();
  }
}
