import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		
		
		int N = sc.nextInt();
		int[] grades = new int[N];
		
		
		int max = -1;
		int sum = 0;
		for(int i=0; i<N; i++) {
			grades[i] = sc.nextInt();
			sum+=grades[i];
			if(grades[i]>max) {
				max = grades[i];
			}
		}
		
		System.out.println( (double) sum*100/(max*N) );
		
		
		
	}

}