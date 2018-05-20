import java.nio.file.*;
import java.io.*;

class FileDelete {
  public static void main(String[] args) throws IOException {
    Path path = Paths.get("mydir/test3.txt");
    try {
      if (false)
        Files.createFile(path);
    } finally {
      Files.delete(path);
    }
  }
}
