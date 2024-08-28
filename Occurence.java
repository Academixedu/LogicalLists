import java.util.ArrayList;

public class Occurence {

    // Function to find the occurrence of a number in an ArrayList
    public static <T> int countOccurrences(ArrayList<T> list, T element) {
        int count = 0;
        for (T item : list) {
            if (item.equals(element)) {
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
        arrayList.add(5); 

        int element = 5;
        System.out.println("Occurrences of " + element + " in ArrayList: " + countOccurrences(arrayList, element));
    }
}
