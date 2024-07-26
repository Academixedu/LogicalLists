import java.util.ArrayList;

public class Sum {
  // Function to add and return all elements in ArrayList
  public static int total(ArrayList<Integer> arrayList) {
    int sum = 0;
    for (int num : arrayList) {
      sum += num;
    }
    return sum;
  }

  public static void main(String[] args) {
    // Create ArrayList Object
    ArrayList<Integer> arrayList = new ArrayList<>();

    // Add Elements to it using For Loop
    for (int i = 1; i <= 10; i++) {
      arrayList.add(i);
    }

    // Print the sum of ArrayList elements
    System.out.println("Sum of ArrayList elements: " + total(arrayList));
  }
}