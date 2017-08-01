package data_structures;
import java.util.*;
public class Anagrams {
    public static int numberNeeded(String first, String second) {
        int firstL = first.length();
        int secL = second.length();

        int comm = 0;
        if(firstL <= secL){
            boolean[] del = new boolean[secL];
            for(int i = 0; i < firstL; i++){
                for(int j = 0; j < secL; j++){
                    if((first.charAt(i) == second.charAt(j)) && !del[j]){
                        comm++;
                        del[j] = true;
                        break;
                    }
                }
            }
        }
        else{
            boolean[] del = new boolean[firstL];
            for(int i = 0; i < secL; i++){
                for(int j = 0; j < firstL; j++){
                    if(first.charAt(j) == second.charAt(i) && !del[j]){
                        comm++;
                        del[j] = true;
                        break;
                    }
                }
            }
        }
        
        return firstL + secL - (comm * 2);
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        in.close();
        System.out.println(numberNeeded(a, b));
    }
}
