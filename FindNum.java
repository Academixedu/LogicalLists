import java.util.ArrayList;

public class FindNum {
    // Method to find whether a particular element is present in an ArrayList
    public static boolean contains(ArrayList<Integer> arrayList, int number) {
        return arrayList.contains(number);
    }

    public static void main(String[] args) {
        // Create an Object for ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        // Load Numbers into ArrayList using add()
        for (int i = 1; i <= 10; i++) {
            arrayList.add(i);
        }

        // Check if ArrayList contains the number 5
        System.out.println("ArrayList contains 5: " + contains(arrayList, 5));
        // Check if ArrayList contains the number 15
        System.out.println("ArrayList contains 15: " + contains(arrayList, 15));
    }
}
