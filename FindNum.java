import java.util.*;
public class FindNum{
  public static <T> boolean contains(ArrayList<T> list, T element) {
    return list.contains(element);
  }
  public static void main(String[]args){
    ArrayList<Integer> arrayList = new ArrayList<>();
    for (int i = 1; i <= 10; i++) {
      arrayList.add(i);
    }
    System.out.println("ArrayList contains 5: " + contains(arrayList, 5));
    System.out.println("ArrayList contains 15: " + contains(arrayList, 15));
  }
}
