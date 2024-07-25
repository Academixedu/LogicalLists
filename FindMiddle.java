import java.util.ArrayList;
import java.util.LinkedList;

public class FindMiddle {

    // Method to find the middle value of an ArrayList
    public static <T> T middle(ArrayList<T> list) {
        return list.get(list.size() / 2);
    }

    // Method to find the middle value of a LinkedList
    public static <T> T middle(LinkedList<T> list) {
        int middleIndex = list.size() / 2;
        return list.get(middleIndex);
    }

    public static void main(String[] args) {
        // Create an ArrayList and a LinkedList object
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        // Add elements from 1 to 10 to both collections
        for (int i = 1; i <= 10; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        // Print the middle elements
        System.out.println("Middle of ArrayList: " + middle(arrayList));
        System.out.println("Middle of LinkedList: " + middle(linkedList));
    }
}
