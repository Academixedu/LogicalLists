import java.util.*;

public class FindMiddle{
    public static <T> T Middle(ArrayList<T> list) {
        return list.get(list.size() / 2);
    }
    public static <T> T Middle(LinkedList<T> list) {
        return list.get(list.size() / 2);
    }
// prepare a function to return middle value of LinkedList
  public static void main(String[]args){

    ArrayList<Integer> arrayList = new ArrayList<>();
    LinkedList<Integer> linkedList = new LinkedList<>();
// create a LinkedList and ArrayList Objects

for (int i = ; i <= 100; i++) {
    arrayList.add(i);
    linkedList.add(i);
}
    // prepare a for Loop of 1 to 10
    // and add elements of for loop in both Objects using add functions
        System.out.println("Middle of ArrayList: " + Middle(arrayList));

        System.out.println("middle value of linkedlist: "+ Middle(linkedList));
    // write a print statement to print middle no of Linkedlist Object
}
}
