import java.util.*;

class BackedCollections {
  public static void main(String[] args) {
    TreeMap<String, String> map = new TreeMap<String, String>();
    map.put("a", "ant");
    map.put("d", "dog");
    map.put("h", "horse");

    SortedMap<String, String> submap;
    submap = map.subMap("b", "g");

    System.out.println(map + " " + submap);

    map.put("b", "bat");
    submap.put("f", "fish");

    map.put("r", "raccoon");

    System.out.println(map + " " + submap);
  }
}
