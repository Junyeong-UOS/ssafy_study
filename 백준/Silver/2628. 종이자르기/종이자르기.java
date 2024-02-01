import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] paper = new int[2];
		String[] input = br.readLine().split(" ");
		paper[0] = Integer.parseInt(input[0]);
		paper[1] = Integer.parseInt(input[1]);
		
		int times = Integer.parseInt(br.readLine());
		
		int[][] cut = new int[times][2];
		int cnt = 0;
		for(int i=0; i<times; i++) {
			String[] input2 = br.readLine().split(" ");
			cut[i][0] = Integer.parseInt(input2[0]);
			cut[i][1] = Integer.parseInt(input2[1]);
			
			if(cut[i][0]==0)
				cnt++;

		}

		int[] cutV = new int[cnt+1];
		int[] cutH = new int[times-cnt+1];
		
		int idxV = 0;
		int idxH = 0;
		
		for(int i=0; i<times; i++) {
			
			if(cut[i][0]==0) {
				cutV[idxV++] = cut[i][1];
			} else {
				cutH[idxH++] = cut[i][1];
			}
		}
		cutV[cnt] = paper[1];
		cutH[times-cnt] = paper[0]; 
		
		Arrays.sort(cutV);
		Arrays.sort(cutH);
		
		//
		List<Integer> cuttedV = new ArrayList<>();
		cuttedV.add(cutV[0]);
		List<Integer> cuttedH = new ArrayList<>();
		cuttedH.add(cutH[0]);
		
		for(int i=1; i<cutV.length; i++) {
			cuttedV.add(cutV[i]-cutV[i-1]);
		}
		
		for(int i=1; i<cutH.length; i++) {
			cuttedH.add(cutH[i]-cutH[i-1]);
		}
		
		int max = 0;
		
		for(int i=0; i<cuttedV.size(); i++) {
			int sum = 0;
			for(int j=0; j<cuttedH.size(); j++) {
				sum = cuttedV.get(i) * cuttedH.get(j);
				if(sum>max) {
					max = sum;
				}
			}
		}
		System.out.println(max);
		
		
	}
	
	
}
