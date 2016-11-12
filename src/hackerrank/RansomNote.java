package hackerrank;

import java.util.*;

public class RansomNote {
    static String magazine = "give me one grand today night";
    static String note = "give one grand today";
    static Map<String, Integer> magazineMap = new HashMap<String, Integer>();
    static Map<String, Integer> noteMap = new HashMap<String, Integer>();

    static String[] magazineArray = null;
    static String[] noteArray = null;
    
    public RansomNote(String magazine, String note) {
    	magazineArray = magazine.split(" ");
    	noteArray = note.split(" ");
    	magazineMap = getStringMap (magazineArray);
    	noteMap = getStringMap (noteArray);
    }
    
    private Map<String, Integer> getStringMap(String[] text) {
    	Map<String, Integer> stringMap = new HashMap<String, Integer>();
    	for (String word : text) {
    		if (!stringMap.containsKey(word)) {
    			stringMap.put(word, 0);
    		}
    		stringMap.put(word, stringMap.get(word) + 1);
    	}
    	return stringMap;
	}

	public boolean solve() {
    	for (Map.Entry<String, Integer> entry : noteMap.entrySet()) {
    		String word = entry.getKey();
    		if (!magazineMap.containsKey(word) || magazineMap.get(word) < entry.getValue()) {
    			return false;
    		}
    	}
    	return true;
    }

    public static void main(String[] args) {
        RansomNote s = new RansomNote(magazine, note);
        boolean answer = s.solve();
        if (answer)
            System.out.println("Yes");
        else System.out.println("No");
      
    }
}

