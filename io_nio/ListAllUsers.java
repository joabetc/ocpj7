import java.io.*;
import java.nio.file.*;

public class ListAllUsers {
  public static void main(String[] args) {
    Path dir = Paths.get("c:/users");
    try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
      for (Path path : stream) {
        System.out.println(path.getFileName());
      }
    } catch (IOException e) {

    }
  }
}
