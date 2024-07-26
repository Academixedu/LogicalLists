import java.util.ArrayList;

public class Occurence {

  // Function to find the occurrence of a number
  // Parameters must contain an ArrayList and an element to check its occurrence
  // or repetition
  public static int countOccurrences(ArrayList<Integer> list, int element) {
    int count = 0;
    for (int num : list) {
      if (num == element) {
        count++;
      }
    }
    return count;
  }

  public static void main(String[] args) {
    ArrayList<Integer> arrayList = new ArrayList<>();
    for (int i = 1; i <= 10; i++) {
      arrayList.add(i);
    }
    arrayList.add(5); // Adding an extra 5 to check for repetition
    int element = 5;
    System.out.println("Occurrences of " + element + " in ArrayList: " + countOccurrences(arrayList, element));
  }
}