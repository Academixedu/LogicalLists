import java.util.ArrayList;

public class Sum{
  // prepare a function to add and return all elements in ArrayList

  public static <T> int total(ArrayList<Integer> list){
    int sum=0;
    for(int i: list){
    sum+=i;
    }
    return sum;
  }
 
  public static void main(String[]args){
  // Create ArrayList Object

   ArrayList<Integer> I = new ArrayList<Integer>();
    // Add Elements to it using For Loop

    for(int i = 0;i<=5;i++) {
      I.add(i);
      
    }
     System.out.println("Sum of ArrayList elements: " + total(I));
  // total is your function name it should return total value
  }}
