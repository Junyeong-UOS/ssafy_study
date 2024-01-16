package swexpertacademy;

import java.util.Scanner;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int N = sc.nextInt();
		
		
			if(N==1) {
				int ans = sc.nextInt();
				System.out.printf("#%d %d\n", test_case, ans);
			} else {
				int[][] farm = new int[N][N];
			
				for (int i=0; i<N; i++) {
					String[] strArr = sc.next().split("");
					for (int j=0; j<N; j++) {
						farm[i][j] = Integer.parseInt(strArr[j]);
					}
				}
	    /*-------------------------------------------------------*/	
			
				int side = 0;
				int ans = 0;
					
				for(int i=0; i<N + 1; i++) {
				
					if(i < N/2) {
						int lside = N/2 - side;
						int rside = N/2 + side;
						for(int j=lside; j<=rside; j++) {
							ans += farm[i][j];
						}				
						side++;
					} else if(i == N/2) {
						int lside = N/2 - side;
						int rside = N/2 + side;
						for(int j=lside; j<=rside; j++) {
							ans += farm[i][j];
						}			
						side--;
					
						} else {
							int lside = N/2 - side;
							int rside = N/2 + side;
							for(int j=lside; j<=rside; j++) {
								ans += farm[i][j];
							}
							side--;
						}
			
	
				}
				System.out.printf("#%d %d\n", test_case, ans);
	
	
			}
		}
	}
}