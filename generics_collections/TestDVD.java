import java.util.*;
import java.io.*;

public class TestDVD {
  ArrayList<DVDInfo> dvdList = new ArrayList<DVDInfo>();

  public static void main(String[] args) {
    new TestDVD().go();
  }

  public void go() {
    populateList();
    System.out.println(dvdList);
    Collections.sort(dvdList);
    System.out.println(dvdList);

    GenreSort gs = new GenreSort();
    Collections.sort(dvdList, gs);
    System.out.println(dvdList);
  }

  public void populateList() {
    DVDInfo dvdInfo = new DVDInfo(
          "Raiders of the Lost Arch",
          "action", "Ford, Harrison");
    this.dvdList.add(dvdInfo);
    dvdInfo = new DVDInfo(
          "Caddyshack",
          "comedy", "Murray, Bill");
    this.dvdList.add(dvdInfo);
  }
}
