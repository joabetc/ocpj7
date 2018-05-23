import java.nio.file.*;

class TestPathMatcher2 {
  public static void main(String[] args) {
    Path path = Paths.get("/com/java/One.java");
    matches(path, "glob:*.java");
    matches(path, "glob:**/*.java");
    matches(path, "glob:*");
    matches(path, "glob:**");
  }

  public static void matches(Path path, String glob) {
    PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
    System.out.println(matcher.matches(path));
  }
}
