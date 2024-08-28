import java.util.*;
public class Sum{
  public static int total(List<Integer>arrayList){
   int sum=0;
   for(int d:arrayList){
    sum+=d;

   }
  return sum;
  }
  // prepare a function to add and return all elements in ArrayList
  public static void main(String[]args){
    List<Integer>arrayList=new ArrayList<Integer>();
    for (int i = 1; i <= 10; i++) {
      arrayList.add(i);
        
    }
  // Create ArrayList Object
    // Add Elements to it using For Loop
     System.out.println("Sum of ArrayList elements: " + total(arrayList));
  // total is your function name it should return total value
  }
  // private static String total(List<Integer> arrayList) {
   
  }
