import java.util.*;
public class contains {
    public static boolean Contains(ArrayList<Integer> ArrayList, int a) {
        
          for (int num : ArrayList) {
              if (num == a) {
                  return true;
              }
          }
          return false;
    
}
}