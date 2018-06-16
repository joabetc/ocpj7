import java.util.*;

public class STtest {
  public static void main(String[] args) {
    StringTokenizer st = new StringTokenizer("a bc d e");
    System.out.println("\n " + st.countTokens());
    while(st.hasMoreTokens()) {
      System.out.print(">" + st.nextToken() + "< ");
    }
    System.out.println("\n " + st.countTokens());

    // Second argument "a" is this StringTokanizer's delimiter

    StringTokenizer st2 = new StringTokenizer("a b cab a ba d", "a");
    System.out.println("\n " + st2.countTokens());
    while(st2.hasMoreTokens()) {
      System.out.print(">" + st2.nextToken() + "< ");
    }
    System.out.println("\n " + st2.countTokens());
  }
}
