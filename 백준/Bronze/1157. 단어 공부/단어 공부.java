import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		int len = input.length();
		
		int[] cnt = new int[26];
		for(int i=0; i<len; i++) {
			cnt[Character.toUpperCase(input.charAt(i)) - 'A']++;
		}

		char ans = '?';
		int max = -1;
		int maxIdx = -1;
		
		for(int i=0; i<26; i++) {
			if(max < cnt[i]) {
				max = cnt[i];
				maxIdx = i;
			}
		}
		int count = 0;
		for(int i=0; i<26; i++) {
			if(max == cnt[i]) count++;
		}
		
		
		if(count == 1) {
			ans = (char) ('A' + maxIdx);
		} 
		System.out.println(ans);
		
	}
}