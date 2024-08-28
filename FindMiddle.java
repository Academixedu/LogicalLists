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
// create a LinkedList and ArrayList Objects
LinkedList<Integer> linkedList=new LinkedList<>();
ArrayList<Integer> arrayList=new ArrayList<>();
    // prepare a for Loop of 1 to 10
    for(int i=1;i<=10;i++){
    arrayList.add(i);
    linkedList.add(i);
  }
        System.out.println("Middle of LinkedList: " + Middle(linkedList));
    // and add elements of for loop in both Objects using add functions
        System.out.println("Middle of ArrayList: " + Middle(arrayList));
    // write a print statement to print middle no of Linkedlist Object
}
}
