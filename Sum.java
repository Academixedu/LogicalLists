package selfPractise;
import java.util.*;
public class Sum{
  public static int add(ArrayList<Integer> arr1){
    int sum=0;
    for(int i:arr1)
    sum+=i;
    return sum;
  } 
  // prepare a function to add and return all elements in ArrayList
  public static void main(String[]args){
  // Create ArrayList Object
    // Add Elements to it using For Loop
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    ArrayList<Integer> arr = new ArrayList<>(num);
    for(int i=0;i<num;i++)
    arr.add(sc.nextInt());
    // System.out.println("Sum of ArrayList elements: " + total(arrayList));
  // total is your function name it should return total value
  System.out.println(add(arr));
  }}
