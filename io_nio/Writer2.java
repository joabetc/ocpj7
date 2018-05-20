import java.io.*;

class Writer2 {
  public static void main(String[] args) {
    char[] in = new char[50];
    int size = 0;

    try {
      File myDir = new File("mydir");
      myDir.mkdir();

      File myFile = new File(myDir, "myFile.txt");
      myFile.createNewFile();

      PrintWriter pw = new PrintWriter(myFile);
      pw.println("howdy");
      pw.println("folks");

      pw.flush();
      pw.close();

      FileReader fr = new FileReader(myFile);
      size = fr.read(in);

      BufferedReader br = new BufferedReader(fr);
      String data = br.readLine();
      System.out.print(size + " ");

      fr.close();
    } catch(IOException e) { }
  }
}
