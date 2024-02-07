import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		// 자료구조의 정보 0:큐 / 1:스택

		List<Integer> initial = new ArrayList<>();

		String[] input1 = br.readLine().split(" ");
		String[] input2 = br.readLine().split(" ");

		for (int i = 0; i < N; i++) {
			if (Integer.parseInt(input1[i]) == 0) {
				initial.add(Integer.parseInt(input2[i]));
			}
		}
		Collections.reverse(initial);
		Queue<Integer> queue = new LinkedList<>(initial);
	
		int M = Integer.parseInt(br.readLine());
		int[] integers = new int[M];
		String[] input3 = br.readLine().split(" ");
		for (int i = 0; i < M; i++) {
			integers[i] = Integer.parseInt(input3[i]);
		}

		for(int i=0; i<M; i++) {
			
			queue.add(integers[i]);
			sb.append(queue.poll() + " ");
		}
		System.out.println(sb);
	}
}