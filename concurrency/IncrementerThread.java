public class IncrementerThread extends Thread {
  private Counter counter;
  public IncrementerThread(Counter counter) {
    this.counter = counter;
  }
  public void run() {
    for(int i = 0; i < 10000; i++) {
      counter.increment();
    }
  }
  public static void main(String[] args) {
    Counter counter = new Counter();
    IncrementerThread it1 = new IncrementerThread(counter);
    IncrementerThread it2 = new IncrementerThread(counter);
    it1.start();
    it2.start();
    try {
      it1.join();
      it2.join();
    } catch(InterruptedException e) {}    
    System.out.println(counter.getValue());
  }
}
