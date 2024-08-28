import java.util.*;
public class FindNum{
  public static boolean contains(ArrayList<Integer> arrayList,int element)
  {
    return arrayList.contains(element);
  }
// Write a method to find whether a particular element is present in an ArrayList
public static void main(String[]args){
  ArrayList<Integer> arrayList = new ArrayList<Integer>();
// Create an Object for ArrayList
for (int i = 1; i <= 100; i++){
  arrayList.add(i);
}
  // Take a For Loop and Load Numbers in to ArrayList using add()

  // Contains is the Method name which you will create
System.out.println("ArrayList contains 5: " + contains(arrayList, 5));
  // it should return either true or false
  
}
}
