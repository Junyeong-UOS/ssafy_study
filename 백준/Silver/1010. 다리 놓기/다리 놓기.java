import java.util.Scanner;

public class Main {
	static double factorial(int n) {

		if (n == 1) {
			return 1;
		}
		return n * factorial(n - 1);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {

			int N = sc.nextInt();
			int M = sc.nextInt();
			if (N == M) {
				System.out.println(1);
			} else {

				double ans = factorial(M) / (factorial(M - N) * factorial(N));

				int ansInt = (int) Math.round(ans);
				System.out.println(ansInt);
			}

		}
	}
}