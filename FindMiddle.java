import java.util.ArrayList;
import java.util.LinkedList;
public class FindMiddle {
    public static <T> T getMiddleElement(ArrayList<T> list) {
        return list.get(list.size() / 2);
    }
    public static <T> T getMiddleElement(LinkedList<T> list) {
        return list.get(list.size() / 2);
    }
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 1; i <= 10; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }
        System.out.println("Middle of ArrayList: " + getMiddleElement(arrayList));
        System.out.println("Middle of LinkedList: " + getMiddleElement(linkedList));
    }
}
