package leetcode;

import java.util.HashMap;
import java.util.Stack;

public class LC20ValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LC20ValidParentheses vp = new LC20ValidParentheses();
		System.out.println("()) "+vp.isValid("())"));
		System.out.println("(() "+vp.isValid("(()"));
		System.out.println("()	"+vp.isValid("()"));
		System.out.println("()[]{}	"+vp.isValid("()[]{}"));
		System.out.println("(]	"+vp.isValid("(]"));
		System.out.println("{)	"+vp.isValid("{)"));
		System.out.println("()}]{}	"+vp.isValid("()}]{}"));
	}
	
	public boolean isValid(String input){
		input=input.trim();
	    HashMap<Character, Character> map = new HashMap<Character, Character>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');
        
        Stack<Character> tmp= new Stack();
        for(int i=0;i<input.length();i++){
        	Character c = input.charAt(i);
        	Character o = map.get(c);
        	if(o!=null)
        		tmp.push(c);
        	else{
        		if(tmp.isEmpty())
        			return false;
        		Character s =tmp.pop();
        		if(s==null || c!=map.get(s))
        			return false;
        	}
        }
	    return true;
	}
}
