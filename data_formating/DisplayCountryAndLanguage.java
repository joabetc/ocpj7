import java.util.*;

public class DisplayCountryAndLanguage {
  public static void main(String[] args) {
    Locale locBR = new Locale("pt", "BR");
    Locale locDK = new Locale("da", "DK");
    Locale locIT = new Locale("it", "IT");

    System.out.println("def " + locBR.getDisplayCountry());
    System.out.println("loc " + locBR.getDisplayCountry(locBR));
    System.out.println("def " + locDK.getDisplayLanguage());
    System.out.println("loc " + locDK.getDisplayLanguage(locDK));
    System.out.println("D>I " + locDK.getDisplayLanguage(locIT));
  }
}
