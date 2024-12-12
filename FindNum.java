import java.util.ArrayList;

public class FindNum{



  public static boolean containss(ArrayList<Integer>arrayList,int q){
    for (Integer b : arrayList) {
      if (b==q) {
        return true;
      }
    }
      return false;
    }
    

public static void main(String[]args){
  ArrayList<Integer>e=new ArrayList<>();
    
   for (int i=1;i<=8;i++) {
    e.add(i);
    System.out.println(i);
   }

 


System.out.println("ArrayList contains 8: " + containss( e, 11));
 
}
}
