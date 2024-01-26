import java.util.Scanner;

public class Main {
	public static void main(String[] args)  {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int restrict = 1;
		int total = 0;
		
		while(restrict <= Math.sqrt(N)) {
			total += N/restrict;
			if(restrict != 1) {
				total = total - restrict + 1;
			}
			restrict++;
		}
		
		System.out.println(total);
		
	}

}