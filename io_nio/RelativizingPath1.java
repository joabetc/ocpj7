import java.nio.file.*;

public class RelativizingPath1 {
  public static void main(String[] args) {
    Path dir = Paths.get("/home/java");
    Path music = Paths.get("/home/java/country/Swift.mp3");
    Path mp3 = dir.relativize(music);
    System.out.println(mp3);
  }
}
