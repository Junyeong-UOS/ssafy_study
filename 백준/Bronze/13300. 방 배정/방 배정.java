import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int[][] students = new int[N][2];
		
		for(int i=0; i<N; i++) { {
				students[i][0] = sc.nextInt();
				students[i][1] = sc.nextInt();
			}
		}	
	
		int[][] ans = new int[6][2];
		
		for(int i=0; i<N; i++) {
			if(students[i][0] == 0) {
				
				ans[students[i][1]-1][0] ++; 
				
			} else {
				ans[students[i][1]-1][1] ++; 
			}
		}
		
		int sum = 0;
		for(int i=0; i<6; i++) {
			for(int j=0; j<2; j++) {
				if(ans[i][j] != 0) {
					
					if(ans[i][j] <= K) {
						sum ++;
					} else {
						sum += (int) Math.ceil((double) ans[i][j]/K);
					}
					
				}
			}
		}
		
		System.out.println(sum);
		
		
	}
	
}