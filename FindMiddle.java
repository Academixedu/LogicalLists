import java.util.ArrayList;
import java.util.LinkedList;

public class FindMiddle{
    public static Integer Middle(ArrayList<Integer> list) {
        return list.get(list.size() / 2);
    }

    public static Integer Middle1(LinkedList<Integer> list) {
        return list.get(list.size() / 2);
    }
// prepare a function to return middle value of LinkedList
  public static void main(String[]args){
// create a LinkedList and ArrayList Objects
    ArrayList<Integer> arrayList = new ArrayList<Integer>();
    LinkedList<Integer> linkedList = new LinkedList<Integer>();
       
    // prepare a for Loop of 1 to 10
    for (int i = 1; i <= 10; i++) {
        arrayList.add(i);
        linkedList.add(i);
    }
    // and add elements of for loop in both Objects using add functions
        System.out.println("Middle of ArrayList: " + Middle(arrayList));
        System.out.println("Middle of LinkedList: " + Middle1(linkedList));

    // write a print statement to print middle no of Linkedlist Object
}
}