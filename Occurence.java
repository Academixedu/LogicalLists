import java.util.*;

public class Occurrence {

    // Method to count occurrences of a specific element in the ArrayList
    public static int countOccurrences(ArrayList<Integer> list, int element) {
        int count = 0;
        for (int i : list) {
            if (i == element) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
                for (int i = 1; i <= 10; i++) {
            arrayList.add(i);
        }
        arrayList.add(9);
        int element = 9;
                System.out.println("Occurrences of " + element + " in ArrayList: " + countOccurrences(arrayList, element));
    }
}
