import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double Vab = sc.nextDouble();
		
		double c = 299792458;
		
		
		double B = (Vab+A) /( (Vab * A / (c*c)) + 1);
		System.out.println(B);
		
		
	}
}