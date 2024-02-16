import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());

		out: for (int tc = 1; tc <= T; tc++) {

			String input = br.readLine(); // 함수 p
			int inputlen = input.length();
			int n = Integer.parseInt(br.readLine()); // 배열에 들어있는 수의 개수

			Deque<Integer> nums = new LinkedList<>();
			String inputlist = br.readLine(); // 배열

			if (n == 0) {
				for (int i = 0; i < inputlen; i++) {
					if (input.charAt(i) == 'D') {
						sb.append("error").append("\n");
//						if (tc != T) {
//							sb.append("\n");
//						}
						continue out;
					}
				}

				sb.append(inputlist).append("\n");
//				if (tc != T) {
//					sb.append("\n");
//				}

			} else {
				int inputlistlen = inputlist.length();

				String[] list = (inputlist.substring(1, inputlistlen - 1)).split(",");
				for (int i = 0; i < n; i++) {
					nums.add(Integer.parseInt(list[i]));
				}

				boolean dir = true; // true : pollFirst // false : pollLast
				for (int i = 0; i < inputlen; i++) {
					if (input.charAt(i) == 'D') {
						if (nums.size() == 0) {
							sb.append("error").append("\n");
//							if (tc != T) {
//								sb.append("\n");
//							}
							continue out;
						} else if (dir) {
							nums.pollFirst();
						} else {
							nums.pollLast();
						}
					} else {
						dir = !dir;
					}
				}

				int tmp = nums.size();
				sb.append("[");

				if (!dir) {
					for (int i = 0; i < tmp; i++) {
						sb.append(nums.pollLast());
						if (i != tmp - 1) {
							sb.append(",");
						}
					}

				} else {
					for (int i = 0; i < tmp; i++) {
						sb.append(nums.pollFirst());
						if (i != tmp - 1) {
							sb.append(",");
						}
					}

				}
				sb.append("]").append("\n");

			}
//			if (tc != T) {
//				sb.append("\n");
//			}
		}
		System.out.print(sb.toString());
	}
}