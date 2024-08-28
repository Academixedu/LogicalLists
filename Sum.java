import java.util.ArrayList;

public class Sum {

    public static int total(ArrayList<Integer> list) {
        int sum = 0;
        for (int num : list) {
            sum += num;
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




/// public class Sum{
//   // prepare a function to add and return all elements in ArrayList
//   public static void main(String[]args){
//   // Create ArrayList Object
//     // Add Elements to it using For Loop
//      System.out.println("Sum of ArrayList elements: " + total(arrayList));
//   // total is your function name it should return total value
//   }}
