import java.util.*;
public class Sum{
  public static int total(ArrayList<Integer> arrayList) {
    int sum = 0;
    for (int num : arrayList) {
       sum += num;
    }
    return sum;
  }
  public static void main(String[]args){
    ArrayList<Integer> arrayList = new ArrayList<>();
    int[] a = new int[10];
    for (int i = 0; i < 10; i++) {
      a[i] = i + 1;
    }
    for (int i = 0; i < 10; i++) {
      arrayList.add(a[i]);
    }
    System.out.println("Sum of ArrayList elements: " + total(arrayList));
  }
}
