import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;

public class WorkingWithDosFileAttributes {
  public static void main(String[] args) {
    try {
      Path path = Paths.get("test");
      Files.createFile(path);
      Files.setAttribute(path, "dos:hidden", true);
      Files.setAttribute(path, "dos:readonly", true);
      DosFileAttributes dos = Files.readAttributes(path, DosFileAttributes.class);
      System.out.println(dos.isHidden());
      System.out.println(dos.isReadOnly());
      Files.setAttribute(path, "dos:hidden", false);
      Files.setAttribute(path, "dos:readonly", false);
      dos = Files.readAttributes(path, DosFileAttributes.class);
      System.out.println(dos.isHidden());
      System.out.println(dos.isReadOnly());
      Files.delete(path);
    } catch (IOException e) {

    }
  }
}
