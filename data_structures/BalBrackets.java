package data_structures;
import java.util.*;

public class BalBrackets {
	
	public static boolean isBalanced(String expression) {
		if(expression.length()%2 != 0)
			return false;
		char first = expression.charAt(0);
		if(first == ']' || first == '}' || first == ')')
			return false;
		
		Stack<Character> curr = new Stack<Character>();
		
		for(int i = 0; i < expression.length(); i++){
			char currBrack = expression.charAt(i);
			if(currBrack == '[' || currBrack == '{' || currBrack == '('){
				curr.push(currBrack);
			}else{
				if(!curr.isEmpty() && !isOppositeBracket(currBrack, curr.pop()))
					return false;
			}
		}
		
		if(curr.isEmpty())
			return true;
		else
			return false;
		
	}
  
	public static boolean isOppositeBracket(char b1, char b2){
		if((b1 == '}' && b2 == '{') ||(b1 == ']' && b2 == '[') || (b1 == ')' && b2 == '('))
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			String expression = in.next();
			System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
		}
		in.close();
	}
}
