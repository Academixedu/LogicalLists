import java.util.*;
public class FindMiddle{
    public static <T> T Middle(ArrayList<T> list) {
        return list.get(list.size() / 2);
    }
// prepare a function to return middle value of LinkedList
 // create a LinkedList and ArrayList Objects
    // prepare a for Loop of 1 to 10
    // and add elements of for loop in both Objects using add functions
    // write a print statement to print middle no of Linkedlist Object
    public static void main(String[]args){
    ArrayList<Integer>v=new ArrayList<Integer>();
    List<Integer>m=new LinkedList<Integer>();
  for (int i = 1; i <= 10; i++) {
    v.add(i);
     m.add(i); 
  }
// ArrayList arrayList = null;
    // System.out.println(v);
     System.out.println("Middle of ArrayList: " + Middle(v));
        System.out.println("Middle of ArrayList: " + Middle(v));
}
}
