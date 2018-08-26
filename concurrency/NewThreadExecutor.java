import java.util.concurrent.Executor;

public class NewThreadExecutor implements Executor {
  @Override
  public void execute(Runnable command) {
    Thread t = new Thread(command);
    t.start();
  }

  public static void main(String[] args) {
    Runnable r = new MyRunnableTask();
    Executor ex = new NewThreadExecutor();
    ex.execute(r);
  }
}
