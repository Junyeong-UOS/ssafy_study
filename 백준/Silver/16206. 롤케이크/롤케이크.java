import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)  {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();

		// 맛있는 롤케이크들 배열
		int[] cakes = new int[N];
		for(int i = 0; i<N; i++) {
			cakes[i] = sc.nextInt();
		}
		
		int cut = 0; // 자르는 횟수
		Arrays.sort(cakes); // 오름차순 정렬 => 10의 배수인 경우 작은 크기의 케이크를 먼저 자른다

		int cakePiece = 0; // 크기가 10인 조각 수

		for(int cake : cakes) {
			int tmp = cake%10;
			
			
			if(cake == 10) {
				cakePiece += 1; // 처음 크기가 10이면 자르지 않는다
			}
			else if(tmp == 0) {
				int i = 0; // 조각 당 자르는 횟수
				while(cut<M && i < cake/10 - 1) {					
					cut++;
					i++;
					cakePiece++;
				}	
				
				if(i == ( (cake/10) - 1) ) { // 10의 배수인 케이크를 최대로 자른 경우
					cakePiece++;
				} 	
			}
		}
		//----------------------------------------------------
		
		for(int cake : cakes) {
			int tmp = cake%10;
			if(tmp != 0) {
				int i = 0; // 조각 당 자르는 횟수
				while(cut<M && i < Math.ceil(cake/10.0) - 1) {					
					cut++;
					i++;
					cakePiece++;
				}	
			}
		}
	
		
		System.out.println(cakePiece); // 맛있게 먹는다

	}

}
