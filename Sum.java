import java.util.ArrayList;

public class Sum{
  // prepare a function to add and return all elements in ArrayList
  public static int total(ArrayList<Integer> al){
    int sum = 0;
    for(int i = 0; i < al.size(); i++){
      sum += al.get(i);
    }
    return sum;
  }
  // prepare a function to add and return all elements in ArrayList
  public static void main(String[]args){
  // Create ArrayList Object
  ArrayList<Integer> al = new ArrayList<Integer>();
    // Add Elements to it using For Loop
    for(int i = 1; i <= 10; i++){
      al.add(i);
    }
     System.out.println("Sum of ArrayList elements: " + total(al));
  // total is your function name it should return total value
  }}
