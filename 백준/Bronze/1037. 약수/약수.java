import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] divisors = new int[N];
		for (int i=0; i<N; i++) {
			divisors[i] = sc.nextInt();
		}

		if (N == 1) {
			System.out.println(divisors[0] * divisors[0]);
		} else {
			Arrays.sort(divisors);
			System.out.println(divisors[0] * divisors[N - 1]);
		}

	}

}