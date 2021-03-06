import java.util.concurrent.Executor;

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
