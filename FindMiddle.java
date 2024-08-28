import java.util.*;
public class FindMiddle{
    public static <T> T Middle(ArrayList<T> list){
        return list.get(list.size() / 2);
    }
    // prepare a function to return middle value of LinkedList
    public static <T> T Middle(LinkedList<T> list){
    
        return list.get(list.size() / 3);
    }

  public static void main(String[]args){
// create a LinkedList and ArrayList Objects
    ArrayList <Integer> arrayList = new ArrayList <Integer>();
    LinkedList <Integer> linkedList = new LinkedList <Integer>();
    // prepare a for Loop of 1 to 10
    // and add elements of for loop in both Objects using add functions
    for(int i=1;i<=10;i++){
        arrayList.add(i);
        linkedList.add(i);
    }
        System.out.println("Middle of ArrayList: " + Middle(arrayList));
    // write a print statement to print middle no of Linkedlist Object
    System.out.println("Middle of LinkedList: " + Middle(linkedList));
}
}
