import java.util.concurrent.Callable;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.lang.InterruptedException;
import java.util.concurrent.ExecutionException;

public class MyCallable implements Callable<Integer> {
  @Override
  public Integer call() {
    int count = ThreadLocalRandom.current().nextInt(1, 11);
    for (int i = 1; i <= count; i++) {
      System.out.println("Running..." + i);
    }
    return count;
  }

  public static void main(String[] args) {
    Callable<Integer> c = new MyCallable();
    ExecutorService ex = Executors.newCachedThreadPool();
    Future<Integer> f = ex.submit(c);
    try {
      Integer v = f.get();
      System.out.println("Ran:" + v);
    } catch (InterruptedException | ExecutionException iex) {
      System.out.println("Failed");
    }
  }
}
