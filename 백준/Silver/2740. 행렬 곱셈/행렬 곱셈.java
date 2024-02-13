import java.util.Scanner;

public class Main {

	static int[][] matrixMul(int[][] arr1, int[][] arr2) {
		int N = arr1.length;
		int M = arr2[0].length;
		int[][] result = new int[N][M];

		for (int r = 0; r < N; r++) {
			for (int c = 0; c < M; c++) {

				for (int i = 0; i < arr1[0].length; i++) {
					result[r][c] += (arr1[r][i] * arr2[i][c]);
				}

			}
		}

		return result;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		int[][] matrixA = new int[N][M];

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				matrixA[i][j] = sc.nextInt();
			}
		}

		M = sc.nextInt();
		int K = sc.nextInt();

		int[][] matrixB = new int[M][K];

		for (int i = 0; i < M; i++) {
			for (int j = 0; j < K; j++) {
				matrixB[i][j] = sc.nextInt();
			}
		}

		int[][] result = matrixMul(matrixA, matrixB);

		for (int[] arr : result) {
			for (int elements : arr) {
				System.out.print(elements + " ");
			}
			System.out.println();
		}

	}
}