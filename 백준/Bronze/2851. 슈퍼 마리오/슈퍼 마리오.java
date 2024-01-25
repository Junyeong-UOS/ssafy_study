import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int point = 0;
		int mushroom = 0;
		int count = 0;
		
		while(point<=100 && count<10) {
			mushroom = sc.nextInt();
			
			point+=mushroom;
			count++;
			
		}
		
		int tmp1 = Math.abs(point - 100);
		int tmp2 = Math.abs( (point-mushroom) - 100 );
		
		if(tmp1 > tmp2) {
			System.out.println(point-mushroom);
		} else {
			System.out.println(point);
		}
	}

}