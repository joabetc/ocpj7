import java.nio.file.*;

public class IterablePath {
  public static void main(String[] args) {
    int spaces = 1;
    Path myPath = Paths.get("tmp", "dir1", "dir2", "dir3", "file.txt");
    for (Path subPath : myPath) {
      System.out.format("%" + spaces + "s%s%n", "", subPath);
      spaces += 2;
    }
  }
}
