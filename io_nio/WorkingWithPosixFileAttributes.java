import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;

public class WorkingWithPosixFileAttributes {
  public static void main(String[] args) {
    try {
      Path path = Paths.get("tmp/file2");
      Files.createFile(path);
      PosixFileAttributes posix = Files.readAttributes(path, PosixFileAttributes.class);
      Set<PosixFilePermission> perms = PosixFilePermissions.fromString("rw-r--r--");
      Files.setPosixFilePermissions(path, perms);
      System.out.println(posix.permissions());
    } catch (IOException e) {

    }
  }
}
