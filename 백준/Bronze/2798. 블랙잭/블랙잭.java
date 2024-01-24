import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] cards = new int[N];
		
		for(int i=0; i<N; i++) {
			cards[i] = sc.nextInt();
		}
		
		int ans = 0;
		
		for(int i=0; i<N-2; i++) {
					
			for(int j=i+1; j<N-1; j++) {
				
				for(int k=j+1; k<N; k++) {
					
					int check = cards[i] + cards[j] + cards[k];
					
					if (ans <= check && check <= M) {
						ans = check;
					}
					
				}
				
			}
			
		}
		
		System.out.println(ans);
		
	}
	
	
}