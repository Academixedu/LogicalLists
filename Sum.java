import java.util.ArrayList;
import java.util.List;

public class Sum {
  
  public int total(List<Integer> list) {
    int sum = 0;
    for (int i : list) {
      sum += i;
    }
    return sum;
  }
  
  public static void main(String[] args) {
    List<Integer> arrayList = new ArrayList<>();
    
    for (int i = 0; i < 7; i++) {
      arrayList.add(i + 1);
    }
    
    Sum sm = new Sum();
    System.out.println("Sum of ArrayList elements: " + sm.total(arrayList));
  }
}
