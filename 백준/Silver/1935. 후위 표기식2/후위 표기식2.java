import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String postfix = sc.next();
		int[] nums = new int[N];
		for(int i=0; i<N; i++) {
			nums[i] = sc.nextInt();
		}
		
		Stack<Double> cal = new Stack<>();
		for (int i = 0; i < postfix.length(); i++) {
			char c = postfix.charAt(i);
			if(c>='A' && c<='Z') {
				cal.push( (double) nums[c-65]);
			} else {
				double a = (double) cal.pop();
				double b = (double) cal.pop();
				if (c == '+') {
					cal.push(a + b);
				} else if(c == '-') {
					cal.push(b-a);
				} else if(c == '*') {
					cal.push(a * b);
				} else {
					cal.push(b/a);
				}
			}
		}

		System.out.printf("%.2f", cal.pop());
	}
}