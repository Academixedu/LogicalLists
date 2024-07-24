import java.util.ArrayList;
public class FindNum{
// Write a method to find whether a particular element is present in an ArrayList
public static boolean contains(ArrayList<Integer> al, int element) {
  for (int i = 0; i < al.size(); i++) {
    if (al.get(i) == element) {
      return true;
    }
  }
  return false;
}
public static void main(String[]args){
// Create an Object for ArrayList
ArrayList<Integer> al = new ArrayList<Integer>();
  // Take a For Loop and Load Numbers in to ArrayList using add()
  for (int i = 1; i <= 10; i++) {
    al.add(i);
  }
  // Contains is the Method name which you will create
System.out.println("ArrayList contains 5: " + contains(al, 21));
  // it should return either true or false
}
}
