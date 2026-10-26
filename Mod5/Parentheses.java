import java.util.Scanner;
import java.util.Stack;

public class Parentheses {
	
	public static boolean parentheses(String s) {
		Stack<Character> stack = new Stack<>();
		for(int i = 0; i<s.length(); i++){
			char c = s.charAt(i);
			if(c == '(' || c == '[' || c == '{'){
				stack.push(c);
			}else if(c == ')' || c == ']' || c == '}'){
				if(stack.isEmpty()){
					return false;
				}
				char comp = stack.pop();
				if(c == ')' && comp != '('){
					return false;
				}
				if(c == ']' && comp != '['){
					return false;
				}
				if(c == '}' && comp != '{'){
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		System.out.println(parentheses(str));
		scan.close();
	}
}

