package data_structures;

public class OneAway {
	
	public static boolean isOneAway(String s1, String s2){
		if(Math.abs(s1.length() - s2.length()) > 1) return false;
		
		int changes = 0;
		
		//check replacements
		if(s1.length() == s2.length()){
			for(int i = 0; i < s1.length(); i++){
				if(s1.charAt(i) != s2.charAt(i))
					changes++;
			}
			if(changes > 1) return false;
		}else{
			//check insertions
			String longer = "";
			String shorter = "";
			if(s1.length() > s2.length()){
				longer = s1;
				shorter = s2;
			}else{
				longer = s2;
				shorter = s1;
			}
			
		
			int j = 0;
			int insertions = 0;
			for(int i = 0; i < longer.length(); i++){
				if(longer.charAt(i) != shorter.charAt(j)){
					insertions++;
				}else{
					j++;
				}
			}
			if(insertions>1) return false;
		}
		
		return true;
	}
	
	public static void main(String [] args){
		String s1 = "pale";
		String s2 = "pales";
		
		System.out.println(isOneAway(s1, s2));
	}
}
