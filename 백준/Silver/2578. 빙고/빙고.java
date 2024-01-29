
import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[][] bingo = new int[5][5];

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				bingo[i][j] = sc.nextInt();
			}
		}

		int[] call = new int[25];
		for (int i = 0; i < 25; i++) {
			call[i] = sc.nextInt();

			for (int k = 0; k < 5; k++) {
				for (int j = 0; j < 5; j++) {
					if (bingo[k][j] == call[i]) {
						bingo[k][j] = 0;
					}
				}
			}
			if(i>10) {
				if (checkBingo(bingo) >= 3) {
					System.out.println(i + 1);
					break;
				}
			}

		}
	}

	public static int checkBingo(int[][] list) {
		int cnt = 0;

		for (int i = 0; i < list.length; i++) {
			int sum = 0;
			for (int j = 0; j < list[i].length; j++) {
				sum += list[i][j];
			}
			if (sum == 0) {
				cnt++;
			}
		}

		for (int i = 0; i < list.length; i++) {
			int sum = 0;
			for (int j = 0; j < list[i].length; j++) {
				sum += list[j][i];
			}
			if (sum == 0) {
				cnt++;
			}
		}

		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i < list.length; i++) {
			sum1 += list[i][i];
			sum2 += list[i][list.length - 1 - i];
		}

		if (sum1 == 0) {
			cnt++;
		}
		if (sum2 == 0) {
			cnt++;
		}

		return cnt;
	}
}
