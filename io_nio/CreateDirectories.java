import java.nio.file.*;
import java.io.*;

class CreateDirectories {
  public static void main(String[] args) {
    try {
      // Path path1 = Paths.get("java/source");
      // Path path2 = Paths.get("java/source/directory");
      // Path file = Paths.get("java/source/directory/Program.java");
      // Files.createDirectory(path1);
      // Files.createDirectory(path2);
      // Files.createFile(file);
      // or
      Path path2 = Paths.get("java/source/directory");
      Path file = Paths.get("java/source/directory/Program.java");
      Files.createDirectories(path2);
      Files.createFile(file);
    } catch (IOException e) {

    }
  }
}
