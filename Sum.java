import java.util.ArrayList;
import java.util.Scanner;

public class Sum{
  // prepare a function to add and return all elements in ArrayList

  public static int total(ArrayList<Integer> list){
    int sum = 0;

    for(int p:list){
      sum=sum+p;
    }
    return sum;
    
  
  }
  
  public static void main(String[]args){
  // Create ArrayList Object
    // Add Elements to it using For Loop

    ArrayList<Integer> arrayList = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    int number = scan.nextInt();
    for(int i=1;i<=number;i++){
      arrayList.add(scan.nextInt());
    }
     System.out.println("Sum of ArrayList elements: " + total(arrayList));
  // total is your function name it should return total value
  }}
