import java.util.ArrayList;

public class FindNum {
    // Method to check if a particular element is present in an ArrayList
    public static <T> boolean contains(ArrayList<T> list, T element) {
        return list.contains(element);
    }

    public static void main(String[] args) {
        // Create an ArrayList object
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Load numbers into the ArrayList using a for loop
        for (int i = 1; i <= 10; i++) {
            arrayList.add(i);
        }

        // Check if the ArrayList contains the number 5 and print the result
        System.out.println("ArrayList contains 5: " + contains(arrayList, 5));
    }
}
