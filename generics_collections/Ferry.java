import java.util.*;

public class Ferry {
  public static void main(String[] args) {
    TreeSet<Integer> times = new TreeSet<Integer>();
    times.add(1205);
    times.add(1505);
    times.add(1545);
    times.add(1830);
    times.add(2010);
    times.add(2100);

    TreeSet<Integer> subset = new TreeSet<Integer>();
    subset = (TreeSet) times.headSet(1600);
    System.out.println("J5 - last before 4pm is: " + subset.last());

    // Java 5 version
    TreeSet<Integer> sub2 = new TreeSet<Integer>();

    sub2 = (TreeSet) times.tailSet(2000);
    System.out.println("J5 - first after 8pm is: " + sub2.first());

    //Java 6 version using the new lower() and higher() methods
    System.out.println("J6 - last before 4pm is: " + times.lower(1600));
    System.out.println("J6 - first after 8pm is: " + times.higher(2000));
  }
}
