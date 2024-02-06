import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			
		String[] input = bf.readLine().split(" ");
		int Hor = Integer.parseInt(input[0]);
		int Ver = Integer.parseInt(input[1]);
		
		int nums = Integer.parseInt(bf.readLine());
		
		int[][] markets = new int[nums][2];
		
		for(int i=0; i<nums; i++) {
			String[] inputMarkets = bf.readLine().split(" ");
			markets[i][0] = Integer.parseInt(inputMarkets[0]);
			markets[i][1] = Integer.parseInt(inputMarkets[1]);
		}

		int[] dongGeun = new int[2];
		String[] inputDongGeun = bf.readLine().split(" ");
		dongGeun[0] = Integer.parseInt(inputDongGeun[0]);
		dongGeun[1] = Integer.parseInt(inputDongGeun[1]);
		
		int result = 0;
		for(int[] market : markets) {
			//System.out.println( shortcut( market,dongGeun, blockHor, blockVer) ); 
			result += shortcut( market,dongGeun, Hor, Ver);
		}
		System.out.println(result);
	}
	
	public static int shortcut(int[] market, int[] dongGeun, int Hor, int Ver) {
		// 1 북 // 2 남 //3 서 // 4 동
		int route = 0;

		int dDir = dongGeun[0];
		int mDir = market[0];
		
		int dp = dongGeun[1];
		int mp = market[1];
		
		
		if(dDir==mDir) {
			route = Math.abs(dp-mp);
			return route;
		}
		
		// 동근 / 상점
		// 북서
		switch(dDir) {
		
		case 1:
			if(mDir==2) { 
				route = Math.min(dp+mp+Ver,Hor-dp + Hor - mp + Ver);
			} else if(mDir==3) {
				route = Math.min(dp+mp, Hor-dp + Ver + Hor + Ver - mp);
			} else {
				route = Math.min(Hor-dp + mp, dp + Ver + Hor + Ver - mp);
			}
			break;
		case 2:
			if(mDir==1) {
				route = Math.min(dp+mp+Ver,Hor-dp + Hor - mp + Ver);
			} else if(market[0]==3) {
				route = Math.min(dp+Ver-mp , Hor-dp+Ver+Hor+mp);
			} else {
				route = Math.min(Hor-dp+Ver-mp, dp+Ver+Hor+mp);
			} 
			break;
		case 3:
			if(mDir==1) {
				route = Math.min(dp+mp, Ver-dp+Hor+Ver+Hor-mp);
			} else if(mDir==2) {
				route = Math.min(Ver-dp+mp, dp+Hor+Ver+Hor-mp);
			} else {
				route = Math.min(dp+Hor+mp, Ver-dp+Hor+Ver-mp);
			}
			break;
		case 4:
			if(mDir==1) {
				route = Math.min(dp+Hor-mp, Ver-dp+Hor+Ver+mp);
			} else if(mDir==2) {
				route = Math.min(Ver-dp+Hor-mp, dp+Hor+Ver+mp);
			} else {
				route = Math.min(dp+Hor+mp, Ver-dp+Hor+Ver-mp);
			}
			break;
		}
		return route;
	}
	
}