import java.util.ArrayList;

public class Sum {
    public static void main(String[] args) {
        // Create ArrayList Object
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Add Elements to it using For Loop
        for (int i = 1; i <= 10; i++) {
            arrayList.add(i);
        }

        // Call the total function and print the result
        System.out.println("Sum of ArrayList elements: " + total(arrayList));
    }

    // Function to calculate the sum of ArrayList elements
    public static int total(ArrayList<Integer> list) {
        int sum = 0;
        for (int element : list) {
            sum += element;
        }
        return sum;
    }
}


