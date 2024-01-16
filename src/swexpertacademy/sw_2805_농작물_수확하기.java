package swexpertacademy;

import java.util.Scanner;

public class sw_2805_농작물_수확하기 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int T = 1;
		
		
		if(N==1) {
			int ans = sc.nextInt();
			System.out.printf("#%d %d\n", T, ans);
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
			System.out.printf("#%d %d\n", T, ans);
	
	
		}
	}
}
