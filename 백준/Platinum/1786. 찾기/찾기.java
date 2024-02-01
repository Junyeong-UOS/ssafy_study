import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String strText = sc.nextLine();
		String strPattern = sc.nextLine();

		char[] pattern = strPattern.toCharArray();
		char[] text = strText.toCharArray();
		
		
		List<Integer> ans = patternMatching(text, pattern);
		
		System.out.println(ans.get(ans.size()-1));
		for(int i=0; i<ans.size()-1; i++) {
			System.out.print(ans.get(i) + " ");
		}

	}
	
	public static List<Integer> patternMatching(char[] text, char[] pattern) {
		int cnt=0;
		int[] ks = ks(pattern);
		List<Integer> is = new ArrayList<>();
		
		int pidx = 0;
		for (int i=0; i<text.length; i++) {
		
			while(pidx > 0 && text[i] != pattern[pidx] ) {
				pidx = ks[pidx-1];
			}
			
			if( text[i] == pattern[pidx]) {
				if(pidx == pattern.length-1) {
					is.add(i-pattern.length+2);
					pidx = ks[pidx];
					cnt++;
				}
				else {
					pidx++;
				}
			}
			
			
		}
		is.add(cnt);
		return is;
	}
	
	public static int[] ks(char[] pattern) {
		int[] ks = new int[pattern.length];
		
		int k = 0;
		for(int i=1; i<pattern.length; i++) {
			
			while(k>0 && pattern[i] != pattern[k]) {
				k = ks[k-1];
			}
			
			if(pattern[i] == pattern[k]) {
				k++;
				ks[i] = k;
			}
			
		}
		
		return ks;
	}
}