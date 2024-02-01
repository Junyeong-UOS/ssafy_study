import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String strText = sc.nextLine();
		String strPattern = sc.nextLine();

		char[] pattern = strPattern.toCharArray();
		char[] text = strText.toCharArray();

		int ans = patternMatching(text, pattern);
		
		System.out.printf("%d\n", ans);

	}

	public static int patternMatching(char[] text, char[] pattern) {
		int cnt=0;
		start : for(int i = 0; i<text.length-pattern.length+1; i++) {
			
			for(int j=0; j<pattern.length; j++) {
				if(text[i+j] != pattern[j]) {
					continue start;
				}
			}
			cnt++;
			i = i+pattern.length-1;;
		}
		
		
		return cnt;
	}
}