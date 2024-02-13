import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static void cantor(boolean[] line, int start, int end, int n) {
		if (n != 0) {

			int s = (end / 3) + start;
			int e = s + (end / 3) - 1;

			for (int i = s; i <= e; i++) line[i] = false;
			
			cantor(line, start, (int) Math.pow(3, n-1), n-1);
			cantor(line, e+1, (int) Math.pow(3, n-1), n-1);

		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		while (sc.hasNext()) {
			int N = sc.nextInt();

			boolean[] line = new boolean[(int) Math.pow(3, N)];
			for(int i=0; i<line.length; i++) {
				line[i] = true;
			}
			
			cantor(line, 0, line.length, N);
			
			for(int i=0; i<line.length; i++) {
				if(line[i]) {
					sb.append("-");
				} else {
					sb.append(" ");
				}
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());

	}
}