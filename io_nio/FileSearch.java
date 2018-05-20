import java.io.*;

class FileSearch {
  public static void main(String[] args) {
      String[] files = new String[100];
      File search = new File("mydir");
      files = search.list();

      for(String fn : files)
        System.out.println("found " + fn);
  }
}
