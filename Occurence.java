import java.util.ArrayList;
public class Occurence{
// prepare a function to find out the occurence of a number
  public static int countOccurrences(ArrayList<Integer> list, int element) {
    int count = 0;
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i) == element) {
        count++;
      }
    }
    return count;
  }
  // paramaters must contain Arraylist and a element to check it's occurence or repetition

  public static void main(String[]args){
   ArrayList<Integer> arrayList = new ArrayList<>();
     for (int i = 1; i <= 10; i++) {
            arrayList.add(i);
        }
        arrayList.add(8);
        arrayList.add(8);
        arrayList.add(5);
        arrayList.add(1);
     int element = 8;
     int element1=5;
     int element2=1;
        System.out.println("Occurrences of " + element + " in ArrayList: " + countOccurrences(arrayList, element));
        System.out.println("Occurrences of " + element1 + " in ArrayList: " + countOccurrences(arrayList, element1));
        System.out.println("Occurrences of " + element2 + " in ArrayList: " + countOccurrences(arrayList, element2));
  }
}
