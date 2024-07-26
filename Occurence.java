
import java.util.ArrayList;
import java.util.Scanner;

public class Occurence{
  public static int countOccurrences(ArrayList <Integer> li,int element){
  int a=0;
  for(int i:li){
    if(i==element){
      a++;
    }
  }
    return a;
  
  }
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of elements:");
    int n=sc.nextInt();
   ArrayList<Integer> arrayList = new ArrayList<>();
     for (int i = 1; i <= n; i++) {
            arrayList.add(i);
        }
        arrayList.add(5);
        arrayList.add(5);
        arrayList.add(7);
        
     int element = 5;
        System.out.println("Occurrences of " + element + " in ArrayList: " + countOccurrences(arrayList, element));
  }
}
