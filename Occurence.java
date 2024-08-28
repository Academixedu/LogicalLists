import java.util.*;
public class Occurence{
  public static int countOccurrences(ArrayList<Integer>arrayList,int element){
    int count = 0;

        for (int num : arrayList) {
            if (num == element) { 
                count++;
                System.out.println(count);
            }
        }
        return count;
  }
// prepare a function to find out the occurence of a number
  // paramaters must contain Arraylist and a element to check it's occurence or repetition
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
