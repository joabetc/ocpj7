import java.util.regex.*;

class GroupTest {
  public static void main(String[] args) {
    Pattern p = Pattern.compile(args[0]);
    Matcher m = p.matcher(args[1]);
    System.out.println("\nsource: " + args[1]);
    System.out.println(" index: 01234567890123456\n");
    System.out.println("pattern: " + m.pattern());
    while(m.find()) {
      System.out.println(m.start() + " " + m.group());
    }
    System.out.println("");
  }
}
