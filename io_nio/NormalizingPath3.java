import java.nio.file.*;

public class NormalizingPath3 {
  public static void main(String[] args) {
    System.out.println(Paths.get("/a/./b/./c").normalize());
    System.out.println(Paths.get(".classpath").normalize());
    System.out.println(Paths.get("/a/b/c/..").normalize());
    System.out.println(Paths.get("../a/b/c").normalize());
  }
}
