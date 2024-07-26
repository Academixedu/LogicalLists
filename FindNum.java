import java.util.ArrayList;

public class FindNum {
    // Method to check if an element is present in the ArrayList
    public static boolean contains(ArrayList<Integer> list, int num) {
        return list.contains(num);
    }

    public static void main(String[] args) {
        // Create an Object for ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Load Numbers into ArrayList using add()
        for (int i = 1; i <= 10; i++) {
            arrayList.add(i);
        }

        // Check if the ArrayList contains a particular element
        System.out.println("ArrayList contains 5: " + contains(arrayList, 5));
    }
}

