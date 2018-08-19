import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;

public class UpdatingBasicAttributes {
  public static void main(String[] args) {
    try {
      Path path = Paths.get("CopyMoveDelete.class");
      BasicFileAttributes basic = Files.readAttributes(
        path, BasicFileAttributes.class);
      FileTime lastUpdated = basic.lastModifiedTime();
      FileTime created = basic.creationTime();
      FileTime now = FileTime.fromMillis(System.currentTimeMillis());
      BasicFileAttributeView basicView = Files.getFileAttributeView(
        path, BasicFileAttributeView.class);
      basicView.setTimes(lastUpdated, now, created);
    } catch (IOException e) {

    }
  }
}
