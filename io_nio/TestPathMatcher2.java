import java.nio.file.*;

class TestPathMatcher2 {
  public static void main(String[] args) {
    Path path1 = Paths.get("Bert-book");
    Path path2 = Paths.get("Kathy-horse");
    matches(path1, "glob:{Bert*,Kathy*}");
    matches(path1, "glob:{Bert,Kathy}*");
    matches(path2, "glob:{Bert,Kathy}");
  }

  public static void matches(Path path, String glob) {
    PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
    System.out.println(matcher.matches(path));
  }
}
