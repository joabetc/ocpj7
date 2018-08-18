import java.nio.file.*;

public class NormalizingPath2 {
  public static void main(String[] args) {
    String buildProject = "/Build_Project/scripts";
    String upTwoDirectories = "../..";
    String myProject = "/My_Project/source";
    Path path = Paths.get(buildProject, upTwoDirectories, myProject);
    System.out.println("Original: " + path);
    System.out.println("Normalized: " + path.normalize());
  }
}
