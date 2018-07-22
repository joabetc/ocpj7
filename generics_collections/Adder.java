import java.util.*;

class Adder {
  int addAll(List list) {
    Iterator it = list.iterator();
    int total = 0;
    while (it.hasNext()) {
      int i = ((Integer) it.next()).intValue();
      total += i;
    }
    return total;
  }
}
