import java.util.ArrayList;

public class Sum {

    // Function to calculate the sum of all elements in an ArrayList
    public static int total(ArrayList<Integer> list) {
        int sum = 0;
        for (int element : list) {
            sum += element;
        }
        return sum;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            arrayList.add(i);
        }

        System.out.println("Sum of ArrayList elements: " + total(arrayList));
    }
}
