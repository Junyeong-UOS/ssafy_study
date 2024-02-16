import java.util.Arrays;
import java.util.Scanner;


public class Main {
	public static double f18 = factorial(18);
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double A = sc.nextInt() / 100.0;
		double B = sc.nextInt() / 100.0;

		double[] Agoals = new double[12];
		double[] Bgoals = new double[12];

		double[] nonePrime = { 0, 1, 4, 6, 8, 9, 10, 12, 14, 15, 16, 18 };
		//int[] prime = { 2, 3, 5, 7, 11, 13, 17 };
		int idx = 0;
		for (double i : nonePrime) {
			Agoals[idx] = (Math.pow(A, i) * Math.pow(1 - A, 18 - i) * combination(i));
			Bgoals[idx] = (Math.pow(B, i) * Math.pow(1 - B, 18 - i) * combination(i));
			idx++;
		}
		
		double p = 1.0;
		for(int i=0; i<12; i++) {
			for(int j=0; j<12; j++) {
				p -= ( Agoals[i] * Bgoals[j] );
			}
		}

		System.out.println(p);
		
	}

	// 18개 중에서S
	// 1 4 6 8 9 10 12 14 15 16 18 개 고르기 (순서 없이)

	static double combination(double r) {

		return f18/( factorial(r)* factorial(18-r));

	}

	static double factorial(double a) {
		if (a == 1 || a == 0) {
			return 1;
		}
		return a * factorial(a - 1);
	}
}