public class MailerBox implements Box, Mailer {
  private Box box;
  public MailerBox(Box box) {
    this.box = box;
  }
  public void pack() {
    box.pack();
  }
  public void seal() {
    box.seal();
  }
  public void addPostage() {
    System.out.println("affix stamps");
  }
  public void ship() {
    System.out.println("put in mailbox");
  }
}
