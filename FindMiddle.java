import java.util.ArrayList;
import java.util.LinkedList;
public class FindMiddle{
    public static int Middle(LinkedList<Integer> list) {
        return list.get(list.size() / 2);

    }
// prepare a function to return middle value of LinkedList
  public static void main(String[]args){
    ArrayList <Integer> a=new ArrayList<Integer>();
    for(int i=1;i<=10;i++){
        a.add(i);
    }
    System.out.println(a);

    System.out.println();
    LinkedList<Integer> b=new LinkedList<Integer>();
    for(int i=1;i<=10;i++){
        b.add(i);
    }
    System.out.println(b);
// create a LinkedList and ArrayList Objects
    // prepare a for Loop of 1 to 10
    // and add elements of for loop in both Objects using add functions
        System.out.println("Middle of LinkedList: " + Middle(b));
    // write a print statement to print middle no of Linkedlist Object
}
}
