import java.io.*;
import java.nio.file.*;

class TestPathMatcher {
  public static void main(String[] args) {
    Path path1 = Paths.get("home/One.txt");
    Path path2 = Paths.get("One.txt");
    PathMatcher matcher = FileSystems.getDefault()
                    .getPathMatcher("glob:*.txt");
    System.out.println(matcher.matches(path1));
    System.out.println(matcher.matches(path2));
  }
}
