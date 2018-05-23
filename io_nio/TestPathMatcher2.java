import java.nio.file.*;

class TestPathMatcher2 {
  public static void main(String[] args) {
    Path path1 = Paths.get("One.java");
    Path path2 = Paths.get("One.ja^a");
    matches(path1, "glob:*.????");
    matches(path1, "glob:*.???");
    matches(path2, "glob:*.????");
    matches(path2, "glob:*.???");
  }

  public static void matches(Path path, String glob) {
    PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
    System.out.println(matcher.matches(path));
  }
}
