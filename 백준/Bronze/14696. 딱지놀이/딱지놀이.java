import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		// 4 별
		// 3 동그라미
		// 2 네모
		// 1 세모
		
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		char[] round = new char[N];
		
		
		for(int j=0; j<N; j++) {
			
			int a = sc.nextInt();
			int[] A = new int[5];
			for(int i=0; i<a; i++) {
				int tmp = sc.nextInt();
				 A[tmp]++;
			}

			int b = sc.nextInt();
			int[] B = new int[5];
			for(int i=0; i<b; i++) {
				int tmp = sc.nextInt();
				B[tmp]++;
			}
			
			// 별의 개수
			if(A[4] != B[4]) {
				if(A[4]>B[4]) {
					round[j] = 'A';
				} else {
					round[j] = 'B';
				}
				
			}
			// 동그라미 개수
			else if(A[3] != B[3]) {
				if(A[3]>B[3]) {
					round[j] = 'A';
				} else {
					round[j] = 'B';
				}
			}
			// 네모 개수
			else if(A[2] != B[2]) {
				if(A[2]>B[2]) {
					round[j] = 'A';
				} else {
					round[j] = 'B';
				}
			}
			// 세모 개수
			else if(A[1] != B[1]) {
				if(A[1]>B[1]) {
					round[j] = 'A';
				} else {
					round[j] = 'B';
				}
			}
			// 무승부
			else {
				round[j] = 'D';
				
			}
		}
		
		for(char result : round) {
			System.out.println(result);
		}
		
	}
	
}