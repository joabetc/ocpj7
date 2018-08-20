import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;

public class PrintDirs extends SimpleFileVisitor<Path> {
  public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
    System.out.println("pre: " + dir);
    String name = dir.getFileName().toString();
    if (name.equals("java"))
      return FileVisitResult.SKIP_SUBTREE;
    return FileVisitResult.CONTINUE;
  }
  public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
    System.out.println("file: " + file);
    return FileVisitResult.CONTINUE;
  }
  public FileVisitResult visitFileFailed(Path file, IOException exc) {
    return FileVisitResult.CONTINUE;
  }
  public FileVisitResult postVisitDirectory(Path dir, IOException exc) {
    System.out.println("post: " + dir);
    return FileVisitResult.CONTINUE;
  }
  public static void main(String[] args) {
    try {
      PrintDirs dirs = new PrintDirs();
      Files.walkFileTree(Paths.get("C:/Users/Joabe/Projetos/ocpj7/io_nio"), dirs);
    } catch (IOException e) {

    }
  }
}
