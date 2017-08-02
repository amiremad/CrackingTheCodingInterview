package algorithms;

import java.util.*;

public class Primality {
    public static void printPrimality(int p){
        if(p == 1){
           System.out.println("Not prime");
           return;
        }
        for(int i = 2; i * i <= p; i++){
            if(p % i == 0){
                System.out.println("Not prime");
                return;
            }
        }
        System.out.println("Prime");
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        for(int a0 = 0; a0 < p; a0++){
            int n = in.nextInt();
            printPrimality(n);
        }
        in.close();
    }
}
