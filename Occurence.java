import java.util.ArrayList;

public class Occurence{
  public static int countOccurrences(ArrayList<Integer>arraylist,int element){
    int u = 0;
    for (Integer p : arraylist) {
      if( p==element){
        u++;
      }
      
    }
    return u;
    
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
        arrayList.add(countOccurrences(arrayList,element));
      Occurence man = new Occurence();
        int occurrences = man.countOccurrences(arrayList, element);
        

        System.out.println("Occurrences of " + element + " in ArrayList: " + countOccurrences(arrayList, element));
  }
}
