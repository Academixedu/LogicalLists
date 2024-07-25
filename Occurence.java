import java.util.ArrayList;
public class Occurence{
// prepare a function to find out the occurence of a number
  // paramaters must contain Arraylist and a element to check it's occurence or repetition
  public static int countOccurrences(ArrayList<Integer> list, int element) {
    int count = 0;
    for (int num : list) {
      if (num == element) {
        count++;
      }
    }
    return count;
  }
  
  public static void main(String[]args){
   ArrayList<Integer> arrayList = new ArrayList<>();
     for (int i = 1; i <= 10; i++) {
            arrayList.add(i);
        }
        arrayList.add(5);
     int element = 5;
        System.out.println("Occurrences of " + element + " in ArrayList: " + countOccurrences(arrayList, element));
  }
}
