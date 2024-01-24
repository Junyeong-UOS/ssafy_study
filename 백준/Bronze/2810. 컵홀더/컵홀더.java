
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		String[] seats = sc.next().split("");

		int cupHolders = 1;
		int countCouples = 0;
		
		for(int i=0; i<seats.length; i++) {
			if(seats[i].equals("L")) {
				countCouples++;
			}
		}	
		
		
		for(int i=0; i<seats.length; i++) {
			
			if(seats[i].equals("L")) {
				if(countCouples%2 == 0) {
					cupHolders ++;
				}
				countCouples++;
			} else {
				cupHolders++;
			}
		}
		
		if(cupHolders < N) {
			System.out.println(cupHolders);
		} else {
			System.out.println(N);
		}

	}	
}
