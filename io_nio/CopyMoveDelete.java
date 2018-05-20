import java.nio.file.*;
import java.io.*;

class CopyMoveDelete {
  public static void main(String[] args) {
    try {
      Path one = Paths.get("mydir/myFile.txt");
      Path two = Paths.get("mydir/myFile0.txt");
      Path targ = Paths.get("mydir/test3.txt");
      Files.copy(one, targ);
      Files.copy(two, targ);
    } catch (IOException e) {

    }
  }
}
