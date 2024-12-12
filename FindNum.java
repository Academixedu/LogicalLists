import java.util.*;
public class FindNum{
// Write a method to find whether a particular element is present in an ArrayList
  public static boolean contains(ArrayList<Integer> list,int n){
    for(int i:list)
      if(i==n)
        return true;

     return false;
  }
public static void main(String[]args){
// Create an Object for ArrayList
  // Take a For Loop and Load Numbers in to ArrayList using add()
  // Contains is the Method name which you will create
  ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            arrayList.add(i + 1);
        }
        System.out.println("ArrayList contains 5: " + contains(arrayList, 5));
  // it should return either true or false
  
}
}
