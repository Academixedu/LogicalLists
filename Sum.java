import java.util.ArrayList;
public class Sum{
  // prepare a function to add and return all elements in ArrayList
  public static int total(ArrayList<Integer> list){
    
    int sum = 0;
    for (int i = 0; i < list.size(); i++) {
      sum += list.get(i);
    }
    return sum;
  }
  public static void main(String[]args){
  // Create ArrayList Object
    // Add Elements to it using For Loop
     ArrayList<Integer> arrayList = new ArrayList<Integer>();
     arrayList.add(1);
     arrayList.add(2);
     arrayList.add(3);
     arrayList.add(4);
     arrayList.add(5);
     System.out.println("Sum of ArrayList elements: " + total(arrayList));
     
  // total is your function name it should return total value
  }}
