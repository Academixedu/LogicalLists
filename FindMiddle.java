import java.util.ArrayList;
import java.util.LinkedList;

public class FindMiddle{
    public static <T> T MiddleArrayList(ArrayList<T> list) {
        return list.get(list.size() / 2);
    }
// prepare a function to return middle value of LinkedList
public static <T> T middleLinkedList(LinkedList<T> list) {
        return list.get(list.size() / 2);
    }
  public static void main(String[]args){
// create a LinkedList and ArrayList Objects
ArrayList<Integer> arrayList = new ArrayList<>();
LinkedList<Integer> linkedList = new LinkedList<>();

    // prepare a for Loop of 1 to 10
    // and add elements of for loop in both Objects using add functions
    for (int i = 1; i <= 10; i++) {
        arrayList.add(i);
        linkedList.add(i);
    }
        System.out.println("Middle of ArrayList: " + MiddleArrayList(arrayList));
    // write a print statement to print middle no of Linkedlist Object
    System.out.println("Middle of LinkedList: " + middleLinkedList(linkedList));
}
}
