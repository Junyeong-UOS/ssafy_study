import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] nums = new int[N];

		int cnt = 0;
		for (int i = 0; i < N; i++) {
			nums[i] = sc.nextInt();
		}

		
		for(int i=0; i<N; i++) {
			int idx = 2;
			if(nums[i] == 1) {
				continue;
			}
			while(nums[i]%idx != 0) {
				idx++;
			}
			if(idx == nums[i]) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
	}

}