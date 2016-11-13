package hackerrank;

import java.util.*;

public class BalancedBrackets {
	
    public static boolean isBalanced(String s) {
    	Stack<Character> stack = new Stack<Character>();
    	for (int i = 0; i < s.length(); i++) {
    		char c = s.charAt(i);
    		if (c == '[' || c == '{' || c == '(') {
    			stack.push(c);
    		} else if (c == ']') {
    			if (stack.isEmpty())
    				return false;
    			if (stack.pop() != '[')
    				return false;
    		} else if (c == '}') {
    			if (stack.isEmpty())
    				return false;
    			if (stack.pop() != '{')
    				return false;
    		} else if (c == ')') {
    			if (stack.isEmpty())
    				return false;
    			if (stack.pop() != '(')
    				return false;
    		}
    	}
    	return stack.isEmpty();

    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++) {
            String s = in.next();
            boolean answer = isBalanced(s);
            if(answer)
                System.out.println("YES");
            else System.out.println("NO");
        }
        in.close();
    }
}
