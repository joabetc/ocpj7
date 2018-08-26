import java.util.concurrent.Executor;

class MyRunnableTask implements Runnable {
  public void run() {
    System.out.println("running");
  }
}

public class SameThreadExecutor implements Executor {
  @Override
  public void execute(Runnable command) {
    command.run();
  }

  public static void main(String[] args) {
    Runnable r = new MyRunnableTask();
    Executor ex = new SameThreadExecutor();
    ex.execute(r);
  }
}
