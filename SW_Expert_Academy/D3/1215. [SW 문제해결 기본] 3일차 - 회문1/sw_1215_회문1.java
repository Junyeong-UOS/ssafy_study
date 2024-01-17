package swexpertacademy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class sw_1215_회문1 {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = 10;
//			T=sc.nextInt();

		
		for (int test_case = 1; test_case <= T; test_case++) {
			int n = Integer.parseInt(br.readLine());
			char[][] palindrome = new char[8][8];
			int cnt = 0;
			
	        for(int r=0; r<8; r++){
	            String line = br.readLine();
	            for(int c=0; c<8; c++){
	            	palindrome[r][c] = line.charAt(c); // charAt()을 이용하여 한 문자씩 받아준다
	            }
	        }
			
//			for(int rowIdx = 0; rowIdx < palindrome.length; rowIdx++) {
//				for(int colIdx = 0; colIdx < palindrome[rowIdx].length; colIdx++) {
//					System.out.print(" " + palindrome[rowIdx][colIdx]);
//				}
//				System.out.println();
//			}
	        
	        
			
			
			for (int r=0; r<8; r++) {
				for (int c=0; c<=8-n; c++) {
					char[] checkChrs = new char[n];
					char[] checkChrsRev = new char[n];
					
					for(int i=0; i<n; i++) {
						checkChrs[i] = palindrome[r][c+i];
						checkChrsRev[n-1-i] = palindrome[r][c+i];
					}
					if (Arrays.equals(checkChrs,checkChrsRev)) {
						cnt++;
					}
				}
			}
			/* - - - - - - - - - -- - - - - - -- - -*/
			
			for (int r=0; r<=8-n; r++) {
				for (int c=0; c<8; c++) {
					char[] checkChrs = new char[n];
					char[] checkChrsRev = new char[n];
					
					for(int i=0; i<n; i++) {
						checkChrs[i] = palindrome[r+i][c];
						checkChrsRev[n-1-i] = palindrome[r+i][c];
					}
					if (Arrays.equals(checkChrs,checkChrsRev)) {
						cnt++;
					}
				}
			}
			
			System.out.printf("#%d %d\n", test_case, cnt);
		}
	}
}
