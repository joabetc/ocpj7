import java.nio.file.*;

class TestPathMatcher2 {
  public static void main(String[] args) {
    Path path1 = Paths.get("0*b/test/1");
    Path path2 = Paths.get("9\\*b/test/1");
    Path path3 = Paths.get("01b/test/1");
    Path path4 = Paths.get("0*b/1");
    String glob = "glob:[0-9]\\*{A*,b}/**/1";
    matches(path1, glob);
    matches(path2, glob);
    matches(path3, glob);
    matches(path4, glob);
  }

  public static void matches(Path path, String glob) {
    PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
    System.out.println(matcher.matches(path));
  }
}
