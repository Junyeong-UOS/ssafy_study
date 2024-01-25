import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String encodedEmail = bf.readLine();
		
		int N = encodedEmail.length();
		List<Integer> divisor = new ArrayList<>();
		
		
		for(int i=1; i<=Math.sqrt(N); i++) {
			if(N%i == 0) {
				divisor.add(i);
			}
		}
		
		int R = divisor.get(divisor.size()-1);
		int C = N/R;
		
		for(int i = 0; i<R; i++) {
			for(int j=0; j<C; j++) {
				int key = j*R + i;
				System.out.print(encodedEmail.charAt(key));
			}
		}
		
		
	}

}