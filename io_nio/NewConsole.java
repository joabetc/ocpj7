import java.io.*;

public class NewConsole {
  public static void main(String[] args) {
    String name = "";
    Console c = System.console();
    char[] pw;
    pw = c.readPassword("%s", "pw: ");
    for(char ch: pw)
      c.format("%c ", ch);

    MyUtility mu = new MyUtility();
    while(true) {
      name = c.readLine("%s", "input?: ");
      c.format("output: %s \n", mu.doStuff(name));
    }
  }
}

class MyUtility {
  String doStuff(String arg1) {
    return "result is " + arg1;
  }
}
