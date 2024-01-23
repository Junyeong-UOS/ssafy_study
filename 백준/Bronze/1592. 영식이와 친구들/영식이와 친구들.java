import java.util.Scanner;

public class Main {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int L = sc.nextInt();
		
		
		int[] roundTable = new int[N];
		roundTable[0] = 1;
		
		int throwing = 0; // 던지는 사람
		int totalThrowing = 0;
			
		while(roundTable[throwing] != M) {
			
			if(roundTable[throwing] % 2 == 0) { 
				
				if(throwing - L >= 0) {
					throwing = throwing - L;
				} else {
					throwing = throwing - L + N;
				}
				
			} else {
				
				if(throwing + L < N) {
					throwing = throwing + L;
				} else {
					throwing = throwing + L - N;
				}	
			}
			roundTable[throwing]++;
			totalThrowing ++;
		}
		System.out.println(totalThrowing);

	}
}