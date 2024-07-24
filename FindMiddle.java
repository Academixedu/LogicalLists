import java.util.ArrayList;
import java.util.LinkedList;

public class FindMiddle{
    public static <T> T Middle(ArrayList<T> list) {
        return list.get(list.size() / 2);
    }
    public static <T> T Middle(LinkedList<T> list) {
        return list.get(list.size() / 2);
    }
// prepare a function to return middle value of LinkedList
  public static void main(String[]args){
// create a LinkedList and ArrayList Objects
ArrayList<Integer> al = new ArrayList<Integer>();
LinkedList<Integer> ll = new LinkedList<Integer>();
    // prepare a for Loop of 1 to 10
    for (int i = 1; i <= 10; i++) {
    // and add elements of for loop in both Objects using add functions
        al.add(i);
        ll.add(i);
    }
    // write a print statement to print middle no of Linkedlist Object
    System.out.println("Middle of ArrayList: " + Middle(al));
    System.out.println("Middle of LinkedList: " + Middle(ll));
}
}
