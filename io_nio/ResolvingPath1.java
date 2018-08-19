import java.nio.file.*;

public class ResolvingPath1 {
  public static void main(String[] args) {
    Path dir = Paths.get("/home/java");
    Path file = Paths.get("models/Model.pdf");
    Path result = dir.resolve(file);
    System.out.println("result = " + result);
  }
}
