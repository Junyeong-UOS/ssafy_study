import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)  {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] cakes = new int[N];
		for(int i = 0; i<N; i++) {
			cakes[i] = sc.nextInt();
		}
		
		int cut = 0;
		Arrays.sort(cakes);

		int cakePiece = 0;

		for(int cake : cakes) {
			int tmp = cake%10;
			
			
			if(cake == 10) {
				cakePiece += 1;
			}
			else if(tmp == 0) {
				int i = 0;
				while(cut<M && i < cake/10 - 1) {					
					cut++;
					i++;
					cakePiece++;
				}	
				
				if(i == ( (cake/10) - 1) ) {
					cakePiece++;
				} 	
			}
		}
		//----------------------------------------------------
		
		for(int cake : cakes) {
			int tmp = cake%10;
			if(tmp != 0) {
				int i = 0;
				while(cut<M && i < Math.ceil(cake/10.0) - 1) {					
					cut++;
					i++;
					cakePiece++;
				}	
			}
		}
	
		
		System.out.println(cakePiece);

	}

}