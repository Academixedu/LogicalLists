import java.util.ArrayList;
import java.util.LinkedList;

public class FindMiddle {

    public static <T> T Middle(ArrayList<T> list) {
        return list.get(list.size() / 2);
    }

    public static <T> T Middle(LinkedList<T> list) {
        return list.get(list.size() / 2);
    }

    public static void main(String[] args) {
        ArrayList<Integer> tt = new ArrayList<>();
        LinkedList<Integer> ss = new LinkedList<>();

        for (int i = 1; i <= 10; i++) {
            tt.add(i);
            ss.add(i);
        }

        System.out.println("Middle of ArrayList: " + Middle(tt));
        System.out.println("Middle of LinkedList: " + Middle(ss));
    }
}
