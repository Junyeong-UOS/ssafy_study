import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] input = br.readLine().split(" ");

		int min = 1000001;
		int max = -1000001;
		
		for(int i=0; i<N; i++) {
			int tmp = Integer.parseInt(input[i]);
			
			if(tmp > max) {
				max = tmp;
			}
			
			if(tmp < min) {
				min = tmp;
			}
			
		}
		
		System.out.println(min + " " + max);
	}

}