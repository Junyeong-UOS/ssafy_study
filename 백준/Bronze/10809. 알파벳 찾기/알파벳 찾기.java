import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = br.readLine();
		int len = input.length();

		int[] count = new int[26];
		for(int i=0; i<26; i++) {
			count[i] = -1;
		}
		
		for (int i = 0; i < len; i++) {
			if (count[input.charAt(i) - 'a'] == -1) {
				count[input.charAt(i) - 'a'] = i;
			}
		}
		for (int i = 0; i < 26; i++) {
			System.out.print(count[i] + " ");
		}
	}

}