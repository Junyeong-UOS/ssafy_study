
import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int C = sc.nextInt();
		int R = sc.nextInt();
		int K = sc.nextInt();

		if (K > C * R) {
			System.out.println(0);
		} else {		
			
			int[] dr = {0, 1, 0, -1};
			int[] dc = {1, 0, -1, 0};
			
			int d = 0;
			
			int[][] snail = new int[C][R];
			
			int r = 0;
			int c = 0;
			int idx = 1;
			int nr;
			int nc;
			
			while(idx <= C*R && idx != K) {
				snail[r][c] = idx++;
	
				nr = r + dr[d];
				nc = c + dc[d];
				
				if(nr >= 0 && nr < C && nc >= 0 && nc < R && snail[nr][nc] == 0) {
					r = nr;
					c = nc;
				} else {
					d = (d+1) % 4;
					r = r + dr[d];
					c = c + dc[d];
				}
				
			}
			
			
			System.out.printf("%d %d\n", r+1, c+1);
			

		}
	}
}