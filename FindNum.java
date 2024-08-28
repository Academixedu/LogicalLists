import java.util.ArrayList;

public class FindNum{
  public static boolean containss(ArrayList<Integer>arrayList,int q){
    for (Integer b : arrayList) {
      if (b==q) {
        return true;
      }
    }
      return false;
    }
    

// Write a method to find whether a particular element is present in an ArrayList
public static void main(String[]args){
  ArrayList<Integer>e=new ArrayList<Integer>();
     e.add(2);
     e.add(5);
   for (Integer a : e) {
    
    System.out.println(a);
   }
FindNum op=new FindNum();
  boolean contains=FindNum.containss(e, 5);
  // Contains is the Method name which you will create
 
System.out.println("ArrayList contains 5: " + containss(arrayList, 5));
  // it should return either true or false
}
}
