import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		StringBuilder sb = new StringBuilder();
		int N = sc.nextInt();
		for (int n = 0; n < N; n++) {
			int check = sc.nextInt();
			switch (check) {
			case 0:
				if (pq.isEmpty()) {
					sb.append("0\n");
				} else {
					sb.append(pq.poll() + "\n");
				}
				break;
			default:
				pq.add(check);
				break;
			}
		}
		System.out.println(sb);
	}
}