import java.util.ArrayList;
public class Sum{

  public static int total(ArrayList<Integer> list) {
    int sum =0;
    for (int i = 0; i < list.size(); i++) {
        sum += list.get(i);
    }
    return sum;
  }
  // prepare a function to add and return all elements in ArrayList
  public static void main(String[]args){
    ArrayList<Integer> ArrayList = new ArrayList<Integer>();

    for (int i = 1; i <= 10; i++) {
        ArrayList.add(i);
    }
    System.out.println(ArrayList);
    
  System.out.println("Sum of ArrayList elements: " + total(ArrayList));



  }
}
