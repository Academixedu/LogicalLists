import java.util.ArrayList;

public class Sum {
    // Method to add and return the sum of all elements in an ArrayList
    public static int total(ArrayList<Integer> list) {
        int sum = 0;
        for (int item : list) {
            sum += item;
        }
        return sum;
    }

    public static void main(String[] args) {
        // Create an ArrayList object
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Load numbers into the ArrayList using a for loop
        for (int i = 1; i <= 10; i++) {
            arrayList.add(i);
        }

        // Print the sum of all elements in the ArrayList
        System.out.println("Sum of ArrayList elements: " + total(arrayList));
    }
}
