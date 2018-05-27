class Exercise1Thread extends Thread implements Runnable {
  public void run() {
    for(int x = 0; x < 100; x++) {
      System.out.println(x);
      if (x % 10 == 0) System.out.println("multiple of 10");
    }
    try {
      Exercise1Thread.sleep(1000);
    } catch(InterruptedException e) { }
  }
  public static void main(String[] args) {
    Exercise1Thread ex = new Exercise1Thread();
    ex.start();
  }
}
