import java.util.*;
public class FindMiddle{
    public static <T> T Middle(ArrayList<T> list) {
        return list.get(list.size() / 2);
    }
    public static <T> T Middle(LinkedList<T> list) {
        return list.get(list.size() / 2);
    }
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of elements:");
    int n=sc.nextInt();
    ArrayList <Integer> arrayList=new ArrayList<>();
    LinkedList <Integer> linkedList=new LinkedList<>();
   for(int i=0;i<=n;i++){
    arrayList.add(i);
    linkedList.add(i);
   }
        System.out.println("Middle of ArrayList: " + Middle(arrayList));
        System.out.println("Middle of LinkedList: " + Middle(linkedList));
    sc.close();
}
}
