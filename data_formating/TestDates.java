import java.util.*;
class TestDates {
  public static void main(String[] args) {
    Date d1 = new Date(1_000_000_000_000L);
    System.out.println("1st date " + d1.toString());
    d1.setTime(d1.getTime() + 3_600_000);
    System.out.println("new time " + d1.toString());
  }
}
