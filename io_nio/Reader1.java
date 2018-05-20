import java.io.*;

class Reader1 {
  public static void main(String[] args) {
    try {
      File existingDir = new File("mydir");
      System.out.println(existingDir.isDirectory());

      File existingDirFile = new File(existingDir, "myFile.txt");
      System.out.println(existingDirFile.isFile());

      FileReader fr = new FileReader(existingDirFile);
      BufferedReader br = new BufferedReader(fr);

      String s;
      while((s = br.readLine()) != null)
        System.out.println(s);

      br.close();
    } catch (IOException e) {

    }
  }
}
