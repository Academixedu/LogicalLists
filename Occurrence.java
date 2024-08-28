import java.util.ArrayList;

public class Occurrence {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            arrayList.add(i);
        }
        arrayList.add(5);
        int element = 5;
        System.out.println("Occurrences of " + element + " in ArrayList: " + countOccurrences(arrayList, element));
    }

    public static int countOccurrences(ArrayList<Integer> list, int element) {
        int count = 0;
        for (int i : list) {
            if (i == element) {
                count++;
            }
        }
        return count;
    }
}


