import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] people = new int[N];
		
		for(int i=0; i<N; i++) {
			people[i] = sc.nextInt();
		}
		
		Arrays.sort(people);
		
		for(int i=1; i<N; i++) {
			people[i] += people[i-1];
		}
		int sum = 0;
		for(int i=0; i<N; i++) {
			sum+=people[i];
		}
		
		System.out.println(sum);
		
		
	}
}