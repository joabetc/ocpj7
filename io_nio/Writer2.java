import java.io.*;

class Writer2 {
  public static void main(String[] args) {
    char[] in = new char[50];
    int size = 0;

    try {
      File file = new File("fileWriter2.txt");
      FileWriter fw = new FileWriter(file);

      PrintWriter pw = new PrintWriter(fw);
      pw.println("howdy");
      pw.println("folks");

      fw.flush();
      fw.close();

      FileReader fr = new FileReader(file);
      size = fr.read(in);

      BufferedReader br = new BufferedReader(fr);
      String data = br.readLine();
      System.out.print(size + " ");
      
      fr.close();
    } catch(IOException e) { }
  }
}
