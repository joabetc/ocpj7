import java.util.concurrent.RecursiveAction;
import java.util.concurrent.RecursiveTask;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.ForkJoinPool;
import java.util.Arrays;

public class SortRecursiveAction extends RecursiveAction {
  private static final int THRESHOLD = 1000;
  private int[] data;
  private int start;
  private int end;

  public SortRecursiveAction(int[] data, int start, int end) {
    this.data = data;
    this.start = start;
    this.end = end;
  }

  @Override
  protected void compute() {
    if (end - start <= THRESHOLD) {
      Arrays.sort(data, start, end);
    } else {
      int halfWay = ((end - start) / 2) + start;
      SortRecursiveAction a1 = new SortRecursiveAction(data, start, halfWay);
      SortRecursiveAction a2 = new SortRecursiveAction(data, halfWay, end);
      invokeAll(a1, a2);
      if (data[halfWay-1] <= data[halfWay]) {
        return;
      }
      int[] temp = new int[end-start];
      int s1 = start, s2 = halfWay, d = 0;
      while(s1 < halfWay && s2 < end) {
        if (data[s1] < data[s2]) {
          temp[d++] = data[s1++];
        } else if (data[s1] > data[s2]) {
          temp[d++] = data[s2++];
        } else {
          temp[d++] = data[s1++];
          temp[d++] = data[s2++];
        }
      }
      if (s1 != halfWay) {
        System.arraycopy(data, s1, temp, d, temp.length - d);
      } else {
        System.arraycopy(data, s2, temp, d, temp.length - d);
      }
      System.arraycopy(temp, 0, data, start, temp.length);
    }
  }
}
