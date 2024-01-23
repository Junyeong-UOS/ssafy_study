import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long N = sc.nextInt();
		long hex = 1;
		long shell = 1;
		long ans;
		
		if(N==1) {
			ans = 1;
		} else {
			while(N>hex) {
				hex  += shell * 6;
				shell++;
			}
		}
		System.out.println(shell);
	}
}