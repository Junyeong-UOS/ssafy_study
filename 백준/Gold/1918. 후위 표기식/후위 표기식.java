import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static String postFix(String expression) {

		String postfix = "";
		Stack<Character> op = new Stack<>();
		Map<Character, Integer> priority = new HashMap<>();

		priority.put('+', 1);
		priority.put('-', 1);
		priority.put('*', 2);
		priority.put('/', 2);
		priority.put('(', 0);

		for (int i = 0; i < expression.length(); i++) {
			char c = expression.charAt(i);

			if (c == '(') {
				op.push(c);
			} else if (c == ')') {
				while (op.peek() != '(') {
					postfix += op.pop();
				}
				op.pop();
			} else if (65 <= c && c <= 90) {
				postfix += c;
			} else {
				// +, -, *, /
				if (op.isEmpty()) {
					op.push(c);
				} else {
					while (!op.isEmpty() && priority.get(c) <= priority.get(op.peek())) {
						postfix += op.pop();
					}
					op.push(c);
				}
			}
		}
		while (!op.isEmpty()) {
			postfix += op.pop();
		}

		return postfix;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String expression = sc.next(); // 문자열
		System.out.printf(postFix(expression));

	}

}