import java.nio.file.*;
import java.io.*;

class NIOSample {
  public static void main(String[] args) {
    try {
      Path path = Paths.get("fileWriter1.txt");
      System.out.println(Files.exists(path));
      Files.createFile(path);
      System.out.println(Files.exists(path));
    } catch (IOException e) {

    }
  }
}
