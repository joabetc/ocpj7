import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.lang.Runtime;

public class ExecutorsSample {
  public static void main(String[] args) {
    Runtime rt = Runtime.getRuntime();
    int cpus = rt.availableProcessors();
    System.out.println(cpus);
    Runnable r = new MyRunnableTask();
    ExecutorService ex = Executors.newSingleThreadExecutor();
    ex.execute(r);
  }
}
