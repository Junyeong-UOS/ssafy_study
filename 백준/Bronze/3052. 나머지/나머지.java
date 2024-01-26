import java.util.Scanner;

public class Main {
	public static void main(String[] args)  {

		Scanner sc = new Scanner(System.in);
		

		int[] range = new int[42];
		int count = 0;
		
		for(int i=0; i<10; i++) {
			int A = sc.nextInt();
			range[A%42]++;		
		}
		
		for(int i=0; i<42; i++) {
			if(range[i]!=0) {
				count++;
			}
		}
		System.out.println(count);
	}

}
