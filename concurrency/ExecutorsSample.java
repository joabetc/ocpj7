import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ExecutorsSample {
  public static void main(String[] args) {
    Runnable r = new MyRunnableTask();
    Executor ex = Executors.newCachedThreadPool();
    ex.execute(r);
  }
}
