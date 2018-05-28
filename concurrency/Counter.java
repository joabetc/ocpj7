import java.util.concurrent.atomic.*;

public class Counter {
  private AtomicInteger count = new AtomicInteger();;
  public void increment() {
    count.getAndIncrement();
  }
  public int getValue() {
    return count.intValue();
  }
}
