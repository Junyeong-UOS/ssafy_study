import java.util.Scanner;

public class Main {
	public static int z(int size, int r, int c) {
		int cnt = 0;
		if(size == 2) {
			if(r<1 && c<1) {
				cnt = 0;
			} else if(r<1 && c>=1) {
				 cnt =1;
			} else if(r>=1 && c<1) {
				cnt = 2;
			} else {
				cnt = 3;
			}
			return cnt;
		}
		//
		int newN = size/2;
		//
		if(r<newN && c<newN) {
			cnt = 0;
		} else if(r<newN && c>=newN) {
			cnt = 1;
			c = c - newN;
		} else if(r>=newN && c<newN) {
			cnt = 2;
			r = r - newN;
		} else {
			cnt = 3;
			r = r-newN;
			c = c-newN;
		}
		
		if(cnt==0) {
			return z(newN,r,c);
		}
		return cnt*newN*newN + z(newN,r,c);
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int r = sc.nextInt();
		int c = sc.nextInt();
		
		
		System.out.println(z((int) Math.pow(2, N),r,c));
		

	}

}