import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		String[] input = br.readLine().split(" ");
		double[] buildings = new double[N + 1];
		for (int i = 0; i < N; i++) {
			buildings[i + 1] = Double.parseDouble(input[i]);
		}

		int[] view = new int[N + 1];

//		for (int i = 1; i < N; i++) {
//			view[i] = 2;
//		}
//
//		for (int i = 1; i < N - 1; i++) {
//
//			for (int j = i + 2; j < N + 1; j++) {
//
//				int k = i + 1;
//				while (k < j && canSee(i, buildings[i], j, buildings[j], k, buildings[k])) {
//					k++;
//				}
//				if (k == j) {
//					view[i]++;
//					view[j]++;
//				}
//			}
//
//		}
		
		for (int i = 1; i < N; i++) {

			for (int j = i + 1; j < N + 1; j++) {

				int k = i + 1;
				while (k < j && canSee(i, buildings[i], j, buildings[j], k, buildings[k])) {
					k++;
				}
				if (k == j) {
					view[i]++;
					view[j]++;
				}
			}

		}
		
		

		double max = 0;

		for (int i = 1; i < N + 1; i++) {
			if (max <= view[i]) {
				max = view[i];
			}
		}
		System.out.println((int) max);
		// System.out.println(Arrays.toString(view));
	}

	static boolean canSee(int a, double b, int c, double d, int x, double y) {

		if (y < (d - b) * (x - a) / (c - a) + b) {
			return true;
		} else {
			return false;
		}

	}
}