import java.util.ArrayList;
public class Sum{
  // prepare a function to add and return all elements in ArrayList
  public static int total(ArrayList<Integer> list){
    int sum = 0;
    for(int i = 0; i < list.size(); i++){
      sum =sum+ list.get(i);
    }
    return sum;
  }
  public static void main(String[]args){
  // Create ArrayList Object
    ArrayList<Integer> arrayList = new ArrayList<Integer>();
    // Add Elements to it using For Loop
    for(int i = 1; i <= 20; i++){
      arrayList.add(i);
    }

     System.out.println("Sum of ArrayList elements: " + total(arrayList));
  // total is your function name it should return total value
  }}
