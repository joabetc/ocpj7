public class AutoboxingExample {
  public static void main(String[] args) {
    Integer y = new Integer(567);
    int x = y.intValue();
    x++;
    y = new Integer(x);
    System.out.println("y = " + y);
  }
}
