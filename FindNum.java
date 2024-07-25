import java.util.ArrayList;

public class FindNum{
// Write a method to find whether a particular element is present in an ArrayList
public static <T> boolean contains(ArrayList<T> list,int num){
  return list.contains(num);
  }
public static void main(String[]args){
// Create an Object for ArrayList
 ArrayList<Integer> I = new ArrayList<Integer>();
  // Take a For Loop and Load Numbers in to ArrayList using add()
   for(int i=0;i<=5;i++){
    I.add(i);

   }
  // Contains is the Method name which you will create
System.out.println("ArrayList contains 5: " + contains(I, 8));
  // it should return either true or false
}
}
