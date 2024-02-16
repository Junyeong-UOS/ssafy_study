import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = br.readLine().split(" ");
		int result = input.length;
		
		
		if(result > 0 && input[0].equals("")) {
			result--;
		}
		
		System.out.println(result);
		
	}
}