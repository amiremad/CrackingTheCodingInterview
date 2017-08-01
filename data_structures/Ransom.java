package data_structures;
import java.util.*;

public class Ransom {
	
	public static String canRansom(HashMap<String, Integer> magazine, HashMap<String, Integer> note){
		for(String key : note.keySet()){
			if((note.get(key) > magazine.get(key)) || !magazine.containsKey(key))
				return "No";
		}
		return "Yes";
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        
        HashMap<String, Integer> magazine = new HashMap<String, Integer>();
        String mWord;
        for(int magazine_i=0; magazine_i < m; magazine_i++){
            mWord = in.next();
            if(magazine.containsKey(mWord))
            	magazine.put(mWord, magazine.get(mWord) + 1);
            else
            	magazine.put(mWord, 1);
        }
        HashMap<String, Integer> note = new HashMap<String, Integer>();
        String nWord;
        for(int note_i=0; note_i < n; note_i++){
            nWord = in.next();
            if(note.containsKey(nWord))
            	note.put(nWord, note.get(nWord) + 1);
            else
            	note.put(nWord, 1);
        }
        in.close();
        
        System.out.println(canRansom(magazine, note));
    }
}
