import java.util.ArrayList;
import java.util.Scanner;

public class FindNum{
  public static boolean contains(ArrayList<Integer> li,int a){
    boolean con=li.contains(a);
    return con;
  }
public static void main(String[]args){
  ArrayList <Integer> arrayList=new ArrayList<>();
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the number of elements:");
  int n=sc.nextInt();
  for(int i=0;i<=n;i++){
    arrayList.add(i);
  }
System.out.println("ArrayList contains 5: " + contains(arrayList, 5));
}
}
