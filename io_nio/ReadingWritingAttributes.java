import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;
import java.util.*;

public class ReadingWritingAttributes {
  public static void main(String[] args) {
    Date januaryFirst = new GregorianCalendar(2013, Calendar.JANUARY, 1).getTime();

    try {
      // old way
      File file = new File("mydir/file");
      file.createNewFile();
      file.setLastModified(januaryFirst.getTime());
      System.out.println(file.lastModified());
      file.delete();

      // new way
      Path path = Paths.get("mydir/file2");
      Files.createFile(path);
      FileTime fileTime = FileTime.fromMillis(januaryFirst.getTime());
      Files.setLastModifiedTime(path, fileTime);
      System.out.println(Files.getLastModifiedTime(path));
      Files.delete(path);
    } catch (IOException e) {}
  }
}
