import java.util.concurrent.RecursiveAction;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.ForkJoinPool;

public class RandomInitRecursiveAction extends RecursiveAction {
  private static final int THRESHOLD = 10000;
  private int[] data;
  private int start;
  private int end;

  public RandomInitRecursiveAction(int[] data, int start, int end) {
    this.data = data;
    this.start = start;
    this.end = end;
  }

  @Override
  protected void compute() {
    if (end - start <= THRESHOLD) {
      for (int i = start; i < end; i++) {
        data[i] = ThreadLocalRandom.current().nextInt();
      }
    } else {
      int halfWay = ((end - start) / 2) + start;
      RandomInitRecursiveAction a1 = new RandomInitRecursiveAction(data, start, halfWay);
      RandomInitRecursiveAction a2 = new RandomInitRecursiveAction(data, halfWay, end);
      invokeAll(a1, a2);
    }
  }

  public static void main(String[] args) {
    int[] data = new int[10_000_000];
    ForkJoinPool fjPool = new ForkJoinPool();
    RandomInitRecursiveAction action = new RandomInitRecursiveAction(data, 0, data.length);
    fjPool.invoke(action);
  }
}
