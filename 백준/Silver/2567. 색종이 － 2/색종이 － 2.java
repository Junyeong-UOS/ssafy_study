import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		int[][] whiteBoard = new int[102][102];

		int length = 0;
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());

			for (int j = x+1; j < x + 11; j++) {
				for (int k = y+1; k < y + 11; k++) {

					if (whiteBoard[j][k] == 0) {
						whiteBoard[j][k] = 1;
					}
				}
			}
		}
		
		int[] dr = {-1, 1, 0, 0};
		int[] dc = {0, 0, -1, 1};
		
		for(int r=1; r<101; r++) {
			for(int c=1; c<101; c++) {
				
				
				if(whiteBoard[r][c]==1) {
					
					for(int i=0; i<4; i++) {
						int nr = r+dr[i];
						int nc = c+dc[i];
						if(nr >= 0 && nr < 102 && nc >= 0 && nc < 102 ) {
							
							if(whiteBoard[nr][nc] == 0) {
								length++;
							}
							
						}

					}				
				}

			}
		}
	
		System.out.println(length);

	}
}