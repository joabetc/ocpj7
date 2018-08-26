import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.Executors;
import java.lang.Runtime;

public class ExecutorsSample {
  public static void main(String[] args) {
    Runtime rt = Runtime.getRuntime();
    int cpus = rt.availableProcessors();
    System.out.println(cpus);
    Runnable r = new MyRunnableTask();
    ThreadPoolExecutor tpe = (ThreadPoolExecutor) Executors.newFixedThreadPool(cpus);
    tpe.setCorePoolSize(cpus * 2);
    tpe.setMaximumPoolSize(cpus * 2);
    tpe.execute(r);
  }
}
