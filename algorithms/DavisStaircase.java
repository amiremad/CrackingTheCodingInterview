package algorithms;

import java.util.*;

public class DavisStaircase {
	// Memoization
	static HashMap<Integer, Integer> memo = new HashMap<Integer, Integer>();
	
	public static int countWays(int n){
		if(n == 1) return 1;
		if(n == 2) return 2;
		if(n == 3) return 4;
		if(n < 0) return 0;
		
		if(memo.containsKey(n)){
			return memo.get(n);
		}else{
			int count = countWays(n - 1) + countWays(n - 2) + countWays(n - 3);
			memo.put(n, count);
		}
		return memo.get(n);
	}
	
		public static void main(String[] args) {
				Scanner in = new Scanner(System.in);
				int s = in.nextInt();
				for(int a0 = 0; a0 < s; a0++){
						int n = in.nextInt();
						System.out.println(countWays(n));
				}
				in.close();
		}
}
