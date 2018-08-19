import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;

public class WorkingWithBasicFileAttributes {
  public static void main(String[] args) {
    try {
      Path path = Paths.get("CopyMoveDelete.java");
      BasicFileAttributes basic = Files.readAttributes(path, BasicFileAttributes.class);
      System.out.println("create: " + basic.creationTime());
      System.out.println("access: " + basic.lastAccessTime());
      System.out.println("modify: " + basic.lastModifiedTime());
      System.out.println("directory: " + basic.isDirectory());
    } catch (IOException e) { }

  }
}
