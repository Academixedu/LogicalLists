import java.util.ArrayList;

public class FindMiddle{
    public static <T> T Middle(ArrayList<T> list) {
        return list.get(list.size() / 2);
    }
// prepare a function to return middle value of LinkedList
  public static void main(String[]args){

    // create a LinkedList and ArrayList Objects
    // prepare a for Loop of 1 to 10
    // and add elements of for loop in both Objects using add functions

    ArrayList arrayList = new ArrayList<>();
   for(int i=1;i<=10;i++){
    arrayList.add(i);
   }
        System.out.println("Middle of ArrayList: " + Middle(arrayList));
    // write a print statement to print middle no of Linkedlist Object

    
}
}
