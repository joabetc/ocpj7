import java.nio.file.*;

public class NormalizingPath1 {
  public static void main(String[] args) {
    Path p1 = Paths.get("myDirectory");
    Path p2 = Paths.get("./myDirectory");
    Path p3 = Paths.get("anotherDirectory", "..", "myDirectory");
    System.out.println(p1.normalize());
    System.out.println(p2.normalize());
    System.out.println(p3.normalize());
  }
}
