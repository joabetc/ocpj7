import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;

public class RemoveClassFiles extends SimpleFileVisitor<Path> {

  public FileVisitResult visitFile (Path file, BasicFileAttributes attrs) throws IOException {
    if (file.getFileName().endsWith(".class")) {
      System.out.println(file.getFileName());
      Files.delete(file);
    }
    return FileVisitResult.CONTINUE;
  }

  public static void main(String[] args) {
    try {
      RemoveClassFiles dirs = new RemoveClassFiles();
      Files.walkFileTree(Paths.get("C:/Users/Joabe/Projetos/ocpj7/io_nio"), dirs);
    } catch (IOException e) {

    }

  }
}
