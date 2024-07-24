import java.util.ArrayList;
public class FindNum {
    public static boolean contains(ArrayList<Integer> list, int element) {
        return list.contains(element);
    }
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            a.add(i);
        }
        System.out.println("ArrayList contains 5: " + contains(a, 5));
        System.out.println("ArrayList contains 15: " + contains(a, 15));
    }
}