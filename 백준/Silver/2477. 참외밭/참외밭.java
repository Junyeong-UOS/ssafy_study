
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {
	public static void main(String[] args) throws IOException {

		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int chamWei = Integer.parseInt(bf.readLine());
		
		int[][] field = new int[6][2];
		
		for(int i=0; i<6; i++) {
			String[] tmp = bf.readLine().split(" ");
			field[i][0] = Integer.parseInt(tmp[0]);
			field[i][1] = Integer.parseInt(tmp[1]);
		}
		
		
		int horLong = 0;
		int verLong = 0;
		
		for(int i = 0; i<6; i++) {
			if(field[i][0] == 1 || field[i][0] == 2) {
				if(field[i][1] >= verLong) {
					verLong = field[i][1];
				}
			}
			else {
				if(field[i][1] >= horLong) {
					horLong = field[i][1];
				} 
			}
		}
		int[] outBox = new int[2];
		int idx = 0;
		
		for(int i=0; i<6; i++) {
			
			int left;
			int right;
			if(i == 0) {
				left = 5;
				right = i+1;
			} else if(i==5) {
				left = i-1;
				right = 0;
			} else {
				left = i-1;
				right = i+1;
			}

			if(field[left][1] != horLong && field[left][1] != verLong && field[right][1] != horLong && field[right][1] != verLong) {
				outBox[idx++] = field[i][1];	
			}
		}
		
		
		
		
		
		int area = horLong*verLong - outBox[0] * outBox[1];
		System.out.println(area*chamWei);
		
		
	}
}
