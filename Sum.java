import java.util.*;
import java.util.Scanner;;

public class Sum{
  public static int total(ArrayList<Integer> arrayList){
    int sum = 0;
    for (int i = 0; i < arrayList.size(); i++) {
      sum += arrayList.get(i);
      
      }
      return sum;
  }
  // prepare a function to add and return all elements in ArrayList
  public static void main(String[]args){
    ArrayList<Integer> arrayList = new ArrayList<>();
    int []a=new int[10];
    Scanner sc =new Scanner(System.in);
    for (int i = 0; i < 5; i++) {
      System.out.println("Enter the number");
        int aa=sc.nextInt();
        a[i]=aa;
        arrayList.add(a[i]); 
    }
  // Create ArrayList Object
    // Add Elements to it using For Loop
     System.out.println("Sum of ArrayList elements: " + total(arrayList));
  // total is your function name it should return total value
  }}
  
