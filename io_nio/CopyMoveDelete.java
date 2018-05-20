import java.nio.file.*;
import java.io.*;

class CopyMoveDelete {
  public static void main(String[] args) {
    try {
      Path source = Paths.get("temp/test1");
      Path target = Paths.get("temp/test2.txt");
      Files.copy(source, target);
      Files.delete(target);
      Files.move(source, target);
    } catch (IOException e) {

    }    
  }
}
