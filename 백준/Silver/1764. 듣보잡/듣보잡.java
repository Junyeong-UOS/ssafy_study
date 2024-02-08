import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		Map<String,Integer> names = new HashMap<>();
		List<String> result = new ArrayList<>();
		
		for(int i=0; i<N; i++) {
			// 못듣0
			names.put(sc.next(), i*2);
		}
		for(int i=0; i<M; i++) {
			String tmp = sc.next();
			if(names.containsKey(tmp)) {
				result.add(tmp);
			} 
		}
		
		Collections.sort(result);
		StringBuilder sb = new StringBuilder();
		System.out.println(result.size());
		for(int i=0; i<result.size(); i++) {
			sb.append(result.get(i) + "\n");
		}
		System.out.println(sb);
	}
}