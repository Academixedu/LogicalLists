import java.util.ArrayList;

public class FindMiddle{
    public static <T> T Middle(ArrayList<T> list) {
        return list.get(list.size() / 2);
    }
// prepare a function to return middle value of LinkedList
  public static void main(String[]args){
// create a LinkedList and ArrayList Objects
ArrayList<Integer> arrayList = new ArrayList<Integer>();
    // prepare a for Loop of 1 to 10
    for(int i = 1; i <= 10; i++){
    // and add elements of for loop in both Objects using add functions
        arrayList.add(i);
    }
    // write a print statement to print middle no of Linkedlist Object
    System.out.println("Middle of ArrayList: " + Middle(arrayList));
}
}
