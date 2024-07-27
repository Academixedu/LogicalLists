package selfPractise;
import java.util.*;
public class FindMiddle{
    public static Integer Middle(ArrayList <Integer> arr1){
        Integer temp = arr1.size();
        return temp/2;
    }
    public static Integer Miiddle(LinkedList <Integer>arr2){
        Integer temp = arr2.size();
        return temp/2;
    }
// prepare a function to return middle value of LinkedList
  public static void main(String[]args){
    LinkedList<Integer>ll = new LinkedList<>();
    ArrayList <Integer>al = new ArrayList<>();
    for(Integer i=0;i<=10;i++)
    {
        ll.add(i);
        al.add(i);
    }
    System.out.println("Middle of the arraylist is : "+ Middle(al));
    System.out.println("middle of the linkedList is : "+ Miiddle(ll));
// create a LinkedList and ArrayList Objects
    // prepare a for Loop of 1 to 10
    // and add elements of for loop in both Objects using add functions
      //  System.out.println("Middle of ArrayList: " + Middle(arrayList));
    // write a print statement to print middle no of Linkedlist Object
}
}
