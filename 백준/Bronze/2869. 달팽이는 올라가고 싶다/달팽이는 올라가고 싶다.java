import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int V = sc.nextInt();
		
		double C = V-A;
		double D = A-B;
		

		System.out.println( (int) Math.ceil(C/D) + 1);
	
	}
}
