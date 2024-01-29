import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		// 난쟁이들
		int[] dwarfs = new int[9];
		for (int i = 0; i < 9; i++) {
			dwarfs[i] = Integer.parseInt(bf.readLine());
		}

		int sum = 0;

		for (int i = 0; i < 9; i++) {
			sum += dwarfs[i];
		}

		int check = sum;
		int notDwarfs1 = 0;
		int notDwarfs2 = 0;
		Arrays.sort(dwarfs);
		for (int i = 0; i < 8; i++) {
			for (int j = i + 1; j < 9; j++) {
				sum -= dwarfs[i];
				sum -= dwarfs[j];
				
				if (sum == 100) {
					notDwarfs1 = i;
					notDwarfs2 = j;
					break;
				} else {
					sum = check;
				}
			}
		}
		
		for(int i=0; i<9; i++) {		
			if(i!=notDwarfs1 && i!=notDwarfs2) {
				System.out.println(dwarfs[i]);
			}
		}
		
	}

}
