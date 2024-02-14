import java.util.Scanner;

public class Main {

	static void stars(boolean[][] box, int n, int startX, int endX, int startY, int endY) {
		
		
		if (n >= 3) {

			int mx = startX + (n / 3);
			int ex = mx + (n / 3) ;
			int my = startY + (n / 3);
			int ey = my + (n / 3) ;
			for(int i=mx; i<ex; i++) {
				for(int j=my; j<ey; j++) {
					box[i][j] = false;
				}
			}
			

			stars(box, n / 3, startX, mx, startY, my);
			stars(box, n / 3, mx, ex, startY, my);
			stars(box, n / 3, ex, endX, startY, my);
			
			stars(box, n / 3, startX, mx, my, ey);
			
			stars(box, n / 3, ex, endX, my, ey);
			
			stars(box, n / 3,  startX, mx, ey, endY);
			stars(box, n / 3, mx, ex, ey, endY);
			stars(box, n / 3, ex, endX, ey, endY);
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		boolean[][] box = new boolean[N][N];
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				box[i][j] = true;
			}
		}
		
		stars(box, N, 0, N, 0, N);
		
		String[][] result = new String[N][N];
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(box[i][j]) {
					result[i][j] = "*";
				} else {
					result[i][j] = " ";
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				sb.append(result[i][j]);
			}
			if(i!=N-1) {
				sb.append("\n");
			}
		}
		System.out.println(sb.toString());
		
	}
}