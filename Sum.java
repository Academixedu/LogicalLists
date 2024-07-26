import java.util.*;
public class Sum{
  public static int total(ArrayList<Integer> li){
    int sum=0;
    for(int i:li){
      sum+=i;
    }
    return sum;
  }

  public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the number of elements:");
  int n=sc.nextInt();
  ArrayList <Integer> List=new ArrayList<>();
  for(int i=0;i<=n;i++){
    List.add(i);
  }

    // Add Elements to it using For Loop
     System.out.println("Sum of ArrayList elements: " + total(List));
  // total is your function name it should return total value
  }}
