import java.util.Scanner;

public class Main {
	static int[] stack = new int[1000000];
	static int top = -1;
	
	
	public static void push(int data) {
		stack[++top] = data;
	}
	public static int peek() {
		if(isEmpty()) {
			return -1;
		}
		return stack[top];
	}
 	public static int pop() {
 		if(isEmpty()) {
 			return -1;
 		}

 		int tmp = stack[top];
 		stack[top--] = 0;
 		return tmp;
 	}
	public static boolean isEmpty() {
		return top == -1;
	}
	public static int size() {
		return top+1;
	}
	
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int N = sc.nextInt();

		for(int i=0; i<N; i++) {
			int command = sc.nextInt();

			switch(command) {
			case 1:
				int integer = sc.nextInt();
				push(integer);
				break;
			case 2:
				sb.append(pop()+"\n");
				break;
			case 3:
				sb.append(size()+"\n");
				break;
			case 4:
				if(isEmpty()) {
					sb.append(1+"\n");
				} else {
					sb.append(0+"\n");
				}
				break;
			case 5:
				sb.append(peek()+"\n");
				break;
			}
			
		}
		System.out.println(sb);
	}

}