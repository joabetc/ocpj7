import java.nio.file.*;

public class ResolvingPath2 {
  public static void main(String[] args) {
    Path absolute = Paths.get("/home/java");
    Path relative = Paths.get("dir");
    Path file = Paths.get("Model.pdf");
    System.out.println("1: " + absolute.resolve(relative));
    System.out.println("2: " + absolute.resolve(file));
    System.out.println("3: " + relative.resolve(file));
    System.out.println("4: " + relative.resolve(absolute));
    System.out.println("5: " + file.resolve(absolute));
    System.out.println("6: " + file.resolve(relative));
  }
}
