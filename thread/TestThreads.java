public class TestThreads {
  public static void main(String[] args) {
    MyRunnable r = new MyRunnable();
    Thread foo = new Thread(r);
    Thread bar = new Thread(r);
    Thread bat = new Thread(r);
  }
}
