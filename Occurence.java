package selfPractise;
import java.util.ArrayList;

public class Occurence{
// prepare a function to find out the occurence of a number
  public void  countOccurrences(ArrayList<Integer> arr,int target){
    int count=0;
    for(int i:arr)
    {
      if(i==target)
      count++;
    }
    System.out.println(count);
  }
  // paramaters must contain Arraylist and a element to check it's occurence or repetition
  public static void main(String[]args){
   ArrayList<Integer> arrayList = new ArrayList<>();
     for (int i = 1; i <= 10; i++) {
            arrayList.add(i);
        }
        arrayList.add(5);
     int element = 5;
     Occurence oc = new Occurence();
     oc.countOccurrences(arrayList,element);
       // System.out.println("Occurrences of " + element + " in ArrayList: " + countOccurrences(arrayList, element));
  }
}
