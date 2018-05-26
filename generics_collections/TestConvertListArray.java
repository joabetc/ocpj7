import java.util.*;

class TestConvertListArray {
  public static void main(String[] args) {
    List<Integer> iL = new ArrayList<Integer>();
    for(int x=0; x<3; x++)
      iL.add(x);
    Object[] oa = iL.toArray();
    Integer[] ia2 = new Integer[3];
    ia2 = iL.toArray(ia2);
  }
}
