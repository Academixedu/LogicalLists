

import java.util.ArrayList;
import java.util.Scanner;

public class Sum {

    public static int total(ArrayList<Integer> arrayList) {
        int sum = 0;
        for (int number : arrayList) {
            sum += number;
        }
        return sum;
    }

    public static void main(String[] args) {
        
        ArrayList<Integer> arrayList = new ArrayList<>();
        int []a=new int[10];
        Scanner in=new Scanner(System.in);
        
        for (int i = 0; i < 9; i++) { 

          
          System.out.println(i+" enter the value");  
                  int oo=in.nextInt();
    
                   a[i]=oo;
                   arrayList.add(a[i]);  
            
        }
      

       
        System.out.println("Sum of ArrayList elements: " + total(arrayList));
    }
}

    
