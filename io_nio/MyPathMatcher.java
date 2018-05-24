import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;

public class MyPathMatcher extends SimpleFileVisitor<Path> {
  private PathMatcher matcher =
    FileSystems.getDefault().getPathMatcher(
      "glob:**/password/**.txt");

  public FileVisitResult visitFile(Path file, BasicFileAttributes attrs)
    throws IOException {
      if (matcher.matches(file)) {
        System.out.println(file);
      }
      return FileVisitResult.CONTINUE;
    }

  public static void main(String[] args) throws IOException {
    MyPathMatcher dirs = new MyPathMatcher();
    Files.walkFileTree(Paths.get("/"), dirs);
  }
}
