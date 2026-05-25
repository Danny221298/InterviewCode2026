package EPAM;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
	public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        
        for(char c : s.toCharArray()) {
            if(map.containsKey(c)) {
                if(stack.isEmpty() || stack.pop() != map.get(c)) return false;
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
    	ValidParentheses sol = new ValidParentheses();
        String input = "{[()]}";
        System.out.println(sol.isValid(input));
    }
}
