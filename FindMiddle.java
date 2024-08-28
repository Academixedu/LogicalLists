import java.util.*;
public class FindMiddle{
     public static <T> T Middle(ArrayList<T> list) {
        return list.get(list.size() / 2);
    }

    public static <T> T Middle1(LinkedList<T> list) {
        return list.get(list.size() / 2);
    }
// prepare a function to return middle value of LinkedList
  public static void main(String[]args){
// create a LinkedList and ArrayList Objects
       LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            linkedList.add(i + 1);
            arrayList.add(i + 1);
        }
        // prepare a for Loop of 1 to 10
        // and add elements of for loop in both Objects using add functions
        System.out.println("Middle of ArrayList: " + Middle(arrayList));
        System.out.println("Middle of ArrayList: " + Middle1(linkedList));
        // write a print statement to print middle no of Linkedlist Object
}
}
