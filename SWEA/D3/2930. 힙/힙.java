import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		int[] heap = new int[100002];
		for (int tc = 1; tc <= T; tc++) {
			
			int heapSize = 0;
			int ch = 0;
			int p = 0;
			
			sb.append("#" + tc);
			
			int N = Integer.parseInt(br.readLine());

			for (int i = 0; i < N; i++) {
				String[] input = br.readLine().split(" ");
				switch (input.length) {

					case 1:
						if (heapSize == 0) {
							sb.append(" " + "-1");
						} else {
							sb.append(" " + heap[1]);
							heap[1] = heap[heapSize];
							heap[heapSize--] = 0;
	
							p = 1;
							ch = p * 2;
	
							if (ch + 1 <= heapSize && heap[ch] <= heap[ch + 1]) {
								ch++;
							}
							while (ch <= heapSize && heap[p] < heap[ch]) {
								int tmp = heap[p];
								heap[p] = heap[ch];
								heap[ch] = tmp;
	
								p = ch;
								ch = p * 2;
								if (ch + 1 <= heapSize && heap[ch] <= heap[ch + 1]) {
									ch++;
								}
							}
						}
						break;
						
					case 2:
						heap[++heapSize] = Integer.parseInt(input[1]);
	
						ch = heapSize;
						p = heapSize / 2;
	
						while (p > 0 && heap[ch] > heap[p]) {
							int tmp = heap[p];
							heap[p] = heap[ch];
							heap[ch] = tmp;
	
							ch = p;
							p = ch / 2;
						}
						break;
				}
			}
			System.out.println(sb.toString());
			sb.setLength(0);
		}

	}

}