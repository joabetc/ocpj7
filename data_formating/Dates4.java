import java.util.*;
import java.text.*;

public class Dates4 {
  public static void main(String[] args) {
    Date d1 = new Date(1000000000000L);
    System.out.println("d1 = " + d1.toString());

    DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
    String s = df.format(d1);
    System.out.println(s);

    try {
      Date d2 = df.parse(s);
      System.out.println("parsed = " + d2.toString());
    } catch (ParseException pe) {
      System.out.println("parse exc");
    }
  }
}
