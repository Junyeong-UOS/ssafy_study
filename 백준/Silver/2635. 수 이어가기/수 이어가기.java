import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int max = 0;
		int secondN = 0;

		for (int i = N; i > 0; i--) {
			int cnt = 2;
			int a = N;
			int b = i;
			int c = a - b;

			while (c >= 0) {
				cnt++;
				a = b;
				b = c;
				c = a - b;
				// System.out.println(c);
			}
			if (cnt > max) {
				max = cnt;
				secondN = i;
			}
		}


		int a = N;
		int b = secondN;
		int c = a - b;
		
		System.out.println(max);
		System.out.print(N + " " + secondN + " ");
		
		while (c >= 0) {
			System.out.print(c + " ");
			a = b;
			b = c;
			c = a - b;
		}
	}

}
