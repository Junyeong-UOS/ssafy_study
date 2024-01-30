import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(bf.readLine());
		
		int[] nums = new int[N];
		int[] count = new int[10000];
		
		for(int i=0; i<N; i++) {
			nums[i] = Integer.parseInt(bf.readLine());
			count[nums[i] - 1]++;
		}
		bf.close();
		
		for (int i = 1; i < 10000; i++) {
			count[i] += count[i - 1];
		}

		int[] result = new int[N];

		for (int i = N - 1; i >= 0; i--) {
			result[--count[nums[i] - 1]] = nums[i];
		}
		
		StringBuilder sb = new StringBuilder();
		for(int num : result) {
			sb.append(num).append("\n");
		}
		System.out.println(sb);
		
	}
	
}