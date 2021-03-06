class DVDInfo implements Comparable<DVDInfo> {
  String title;
  String genre;
  String leadActor;

  DVDInfo(String t, String g, String a) {
    title = t;
    genre = g;
    leadActor = a;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getGenre() {
    return genre;
  }

  public void setGenre(String genre) {
    this.genre = genre;
  }

  public String toString() {
    return title + " " + genre + " " + leadActor + "\n";
  }

  public int compareTo(DVDInfo d) {
    return title.compareTo(d.getTitle());
  }
}
