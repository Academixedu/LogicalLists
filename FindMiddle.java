import java.util.ArrayList;
import java.util.LinkedList;


public class FindMiddle{
    public static <T> T Middle(ArrayList<T> list) {
        return list.get(list.size() / 2);
    }
    public static <T> T Middle1(LinkedList<T> list1) {
        return list1.get(list1.size()/2);
    }
// prepare a function to return middle value of LinkedList
  public static void main(String[]args){
// create a LinkedList and ArrayList Objects
   LinkedList<Integer> I = new LinkedList<Integer>();
   ArrayList<Integer>  J = new ArrayList<Integer>();
    // prepare a for Loop of 1 to 10

    for(int i = 0;i<10;i++){
        I.add(i);
        J.add(i);
    }
    // and add elements of for loop in both Objects using add functions
        System.out.println("Middle of ArrayList: " + Middle(J));
    // write a print statement to print middle no of Linkedlist Object
        System.out.println("Middle of LinkedList:" + Middle1(I));
}
}
