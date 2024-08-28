import java.util.ArrayList;
import java.util.List;

public class Sum{
  public static int total(ArrayList <Integer>arraylist){
    int sum=0;
    for (int c :arraylist) {
      sum +=c;
    }
    return sum;
  }
  public static void main(String[]args ){
    ArrayList<Integer> arrayList = new ArrayList<Integer>();
     arrayList.add(total(arrayList));
     for(int g=1;g<=5;g++){
      arrayList.add(g);
      System.out.println(g);
    }
  

    System.out.println("Sum of ArrayList elements: " + total(arrayList));
  }}
