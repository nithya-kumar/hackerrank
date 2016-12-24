package hackerrank;
/* Group a string based on a given index.
 * The first group can contain characters less than the desired index */

public class GroupAString {
	public static String Solution(String S, int K) {
    	String T = new String ();
    	// Removing '-' to find the correct length
        S = S.replace("-", ""); 
        int length = S.length();
        
        // Base Case
        if (length == 1) {
        	return S.toUpperCase();
        }
        
        // Finding an index to fix the first group
        int index = 0;
        if (length % K == 0)
            index = K;
        else
            index = length % K;
        
        T = S.substring(0, index);
    	for (int i = index ; i < length ; i = i + K) {
    		T = T + '-' + S.substring(i, i + K);
    	}
        return T.toUpperCase();
    }
    
    public static void main(String args[]) {
        String S = new String ("nithya-kumar");
        int K = 5;
        System.out.println(Solution(S, K));
    }
}
