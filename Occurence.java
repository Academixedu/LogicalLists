import java.util.ArrayList;
public class Occurence{
// prepare a function to find out the occurence of a number
public static <T> int countOccurrences(ArrayList<T> list, T element) {

  int count = 0;

  for (T item : list) {
    if (item.equals(element)) {
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
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(2);
        arrayList.add(4);
     int element = 2;
     int element1=1;
     int element2=4;
        System.out.println("Occurrences of " + element1 + " in ArrayList: " + countOccurrences(arrayList, element1));
        System.out.println("Occurrences of " + element2 + " in ArrayList: " + countOccurrences(arrayList, element2));
        System.out.println("Occurrences of " + element + " in ArrayList: " + countOccurrences(arrayList, element));
  }
}
