import java.util.*;

public class ArrayListRunnable implements Runnable {
  private List<Integer> list = new ArrayList<>();

  public ArrayListRunnable() {
    for (int i = 0; i < 100000; i++) {
      list.add(i);
    }
  }

  public void run() {
    String tName = Thread.currentThread().getName();
    while(!list.isEmpty()) {
      System.out.println(tName + " removed " + list.remove(0));
    }
  }

  public static void main(String[] args) {
    ArrayListRunnable alr = new ArrayListRunnable();
    Thread t1 = new Thread(alr);
    Thread t2 = new Thread(alr);
    t1.start();
    t2.start();
  }
}
