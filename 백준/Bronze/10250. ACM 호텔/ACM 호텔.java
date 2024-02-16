import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {

			int H = sc.nextInt();
			int W = sc.nextInt();
			int N = sc.nextInt();

			if (N > H) {
				if(N % H == 0) {
					System.out.print(H);
					if (N / H < 10) {
						System.out.print(0);
					}
					System.out.print(N / H);
					
				} else {
					System.out.print(N % H);
					if (N / H + 1 < 10) {
						System.out.print(0);
					}
					System.out.print(N / H + 1);
				}
			}

			else {
				System.out.print(N);
				System.out.print(0);
				System.out.print(1);
			}
			System.out.print('\n');
		}
		

	}
}