import java.util.*;
public class FindMiddle{
    public static <T> T Middle(ArrayList<T> list) {
        return list.get(list.size() / 3);
    }
    public static <T> T Middle(LinkedList<T> list) {
      return list.get(list.size() / 2);
  }
  public static void main(String[]args ){
    ArrayList<Integer>y=new ArrayList<Integer>();
    LinkedList<Integer>m=new LinkedList<Integer>();

      for(int i=1;+i<11;i++){
        System.out.println(i);
        y.add(i);
        m.add(i);
      }
      
        
      
    
    
        System.out.println("Middle of ArrayList: " +   Middle(y));
        System.out.println("Middle of linked list:"+Middle(m));
    // write a print statement to print middle no of Linkedlist Object
}
}
