package selfPractise;

import java.util.ArrayList;

public class FindNum{
// Write a method to find whether a particular element is present in an ArrayList
public static boolean contains(ArrayList<Integer> ar,int targer){
  int count=0;
  for(int i:ar)
  {
    if(i==targer)
    count++;
  }
  if(count!=0)
  return true;
  return false;
}
public static void main(String[]args){
// Create an Object for ArrayList
  // Take a For Loop and Load Numbers in to ArrayList using add()
  // Contains is the Method name which you will create
  ArrayList<Integer> ar = new ArrayList<>();
  for(int i=0;i<10;i++)
  {
    if(i%4==0)
    ar.add(5);
    else
    ar.add(i);
  }
 // System.out.print(ar +" ");
System.out.println("ArrayList contains 5: " + contains(ar, 5));
  // it should return either true or false
}
}
