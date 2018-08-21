import java.io.*;
import java.nio.file.*;

public class WatchDirectory {
  public static void main(String[] args) {
    Path dir = Paths.get("/dir");

    try {
      WatchService watcher = FileSystems.getDefault().newWatchService();
      dir.register(watcher, StandardWatchEventKinds.ENTRY_DELETE);

      while(true) {
        WatchKey key;
        try {
          key = watcher.take();
        } catch (InterruptedException e) {
          return;
        }
        for (WatchEvent<?> event : key.pollEvents()) {
          WatchEvent.Kind<?> kind = event.kind();
          System.out.println(kind.name());
          System.out.println(kind.type());
          System.out.println(event.context());
          String name = event.context().toString();
          if (name.equals("directoryToDelete")) {
            System.out.println("Directory deleted, now we can proceed");
          }
        }
        key.reset();
      }
    } catch (IOException e) {}
  }
}
