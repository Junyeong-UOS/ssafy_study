import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		for (int test_case = 1; test_case <= 4; test_case++) {

			int[][] rect = new int[4][2];

			String[] tmp = bf.readLine().split(" ");

			for (int i = 2; i <= 8; i += 2) {
				rect[i / 2 - 1][0] = Integer.parseInt(tmp[i - 2]);
				rect[i / 2 - 1][1] = Integer.parseInt(tmp[i - 1]);
			}
			int x1 = rect[0][0];
			int y1 = rect[0][1];
			int p1 = rect[1][0];
			int q1 = rect[1][1];
			
			int x2 = rect[2][0];
			int y2 = rect[2][1];
			int p2 = rect[3][0];
			int q2 = rect[3][1];

			// (x1,y1) (p1,q1) (x2,y2) (p2,q2)

			// 안겹침
			if ( x2>p1 || x1>p2 || y1>q2 || y2>q1  ) {
				System.out.println("d");
			}
			// 점
			else if (x2 == p1 && y1 == q2) {
				System.out.println("c");
			} 
			else if(x2 == p1 && q1 == y2) {
				System.out.println("c");
			}
			else if (x1 == p2 && y1 == q2) {
				System.out.println("c");
			}
			else if (x1 == p2 && q1 == y2) {
				System.out.println("c");
			}
			// 선분
			else if (x2 == p1 || x1 == p2 || y1==q2 || y2==q1) {
				System.out.println("b");
			} 
			// 겹침
			else {
				System.out.println("a");
			}
		}

	}
}