import java.util.ArrayList;
import java.util.Scanner;

public class FindNum{
// Write a method to find whether a particular element is present in an ArrayList


public static boolean contains(ArrayList<Integer> List, int num){
  return List.contains(num);
  }

public static void main(String[]args){
// Create an Object for ArrayList
  // Take a For Loop and Load Numbers in to ArrayList using add()
  // Contains is the Method name which you will create
  ArrayList<Integer> arrayList = new ArrayList<>();
  Scanner scan = new Scanner(System.in);
  int number = scan.nextInt();
  for(int i=0;i<number; i++){
    arrayList.add(scan.nextInt());
  }


System.out.println("ArrayList contains 5: " + contains(arrayList, 5));
  // it should return either true or false
}
}

