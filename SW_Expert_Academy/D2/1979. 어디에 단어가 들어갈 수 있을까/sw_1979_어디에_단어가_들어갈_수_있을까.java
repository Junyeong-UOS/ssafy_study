package swexpertacademy;

import java.util.Scanner;
import java.io.FileInputStream;

class sw_1979_어디에_단어가_들어갈_수_있을까
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        int[] dr = { 1, 0, -1, 0 }; // 하, 우, 상, 좌
        int[] dc = { 0, 1, 0, -1 };
        
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int N = sc.nextInt();
            int K = sc.nextInt();
            int ans = 0;

            // 퍼즐 받아오기
            int[][] puzzle = new int[N][N];

            for (int r = 0; r < N; r++) {
                for (int c = 0; c < N; c++) {
                    puzzle[r][c] = sc.nextInt();
                }
            }

            // 탐색
            for (int r = 0; r < N; r++) {
                for (int c = 0; c < N; c++) {

                    if (puzzle[r][c] == 1) {
                        
                        for (int i = 0; i < 2; i++) {
                            int cnt = 1;
                            int nr = r + dr[i];
                            int nc = c + dc[i];

                            
                            while (0 <= nr && nr < N && 0 <= nc && nc < N) {
                                if (puzzle[nr][nc] == 0) {
                                    break;
                                } else {
                                    cnt++;
                                }

                                nr = nr + dr[i];
                                nc = nc + dc[i];
                            }

                            nr = r - dr[i];
                            nc = c - dc[i];

                            while (0 <= nr && nr < N && 0 <= nc && nc < N) {
                                if (puzzle[nr][nc] == 0) {
                                    break;
                                } else {
                                    cnt++;
                                }

                                nr = nr - dr[i];
                                nc = nc - dc[i];
                            }

                            if (cnt == K) {
                                ans++;
                            }
                        }

                    }
                }

            }
            System.out.printf("#%d %d\n", test_case, ans/K);
		}
	}
}