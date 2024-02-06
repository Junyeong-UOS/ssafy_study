import java.util.Scanner;
import java.util.Stack;
import java.util.stream.Collectors;

public class Main {
	public static String check(String s) {
		Stack<Character> brackets = new Stack<>();
		if(s.length() == 0) {
			return "";
		}
		brackets.push(s.charAt(0));
		for (int i=1;  i< s.length(); i++) {
			if (s.charAt(i) == ')') {
				if (s.charAt(i - 1) == '(') {
					brackets.pop();
				} else {
					brackets.push(')');
				}
			}
			else {
				brackets.push('(');
			}
		}	
		String stStr = brackets.stream().map(str -> str.toString()).collect(Collectors.joining(""));
		return stStr;	
	}
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			Stack<Character> brackets = new Stack<>();

			String bracketsStr = sc.next();
			String a = check(bracketsStr);
			while(!a.equals(check(a))) {
				a = check(a);
			}
			
			if(a.length() != 0) {
				System.out.println("NO");
			} else
				System.out.println("YES");
			
		}
	}

}