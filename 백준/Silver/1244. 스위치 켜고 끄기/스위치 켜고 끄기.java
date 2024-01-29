
import java.util.Scanner;

class Main {
	public static void change(int state) {
		if(state == 0) {
			state = 1;
		} else {
			state = 0;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] switches = new int[N];
		
		for(int i=0; i<N; i++) {
			switches[i] = sc.nextInt();
		}
		
		int M = sc.nextInt();
		
		int[][] students = new int[M][2];
		
		for(int i=0; i<M; i++) {
			students[i][0] = sc.nextInt();
			students[i][1] = sc.nextInt();
		}
		
		
		for(int i=0; i<M; i++) {
			
			if(students[i][0] == 1) {
				
				int male = students[i][1];
				int mul = 1;
				
				while(male*mul - 1 < N) {
					if(switches[male*mul - 1] == 0) {
						switches[male*mul - 1] = 1;
					} else {
						switches[male*mul - 1] = 0;
					}
					mul++;
				}
			} else {
				int female = students[i][1]-1;
				if(switches[female] == 0) {
					switches[female] = 1;
				} else {
					switches[female] = 0;
				}
				
				int idx = 1;
				while(female+idx<N && female-idx>=0 && switches[female-idx] == switches[female+idx]) {
					if(switches[female+idx] == 0) {
						switches[female+idx] = 1;
					} else {
						switches[female+idx] = 0;
					}
					if(switches[female-idx] == 0) {
						switches[female-idx] = 1;
					} else {
						switches[female-idx] = 0;
					}
					idx++;
				}
		
			}
			
		}
		for(int i=1; i<N+1; i++) {
			System.out.print(switches[i-1]);
			
			if(i%20 == 0) {
				System.out.println();
			} else {
				System.out.print(" ");
			}
			
		}
		
		
		
	}
}
