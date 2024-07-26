
import java.util.ArrayList;
import java.util.LinkedList;

public class FindMiddle {

    public static <T> T middleOfArrayList(ArrayList<T> list) {
        return list.get(list.size() / 2);
    }

    public static <T> T middleOfLinkedList(LinkedList<T> list) {
        return list.get(list.size() / 2);
    }

    public static void main(String[] args) {
        // Create LinkedList and ArrayList objects
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Prepare a for loop from 1 to 10 and add elements to both objects
        for (int i = 1; i <= 10; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        // Output the middle elements
        System.out.println("Middle of ArrayList: " + middleOfArrayList(arrayList));
        System.out.println("Middle of LinkedList: " + middleOfLinkedList(linkedList));
    }
}
