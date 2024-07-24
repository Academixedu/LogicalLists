import java.util.ArrayList;

public class FindNum {
    public static boolean contains(ArrayList<Integer> list, int num) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == num) {
                return true;  
            }
        }
        return false; 
    }


    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i = 1; i <= 10; i++) {
            a.add(i);
        }
        System.out.println(a);

        System.out.println("ArrayList contains 5: " + contains(a, 5));
    }
}
