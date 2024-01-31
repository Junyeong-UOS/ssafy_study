import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		String[] tmp = br.readLine().split(" ");
		int w = Integer.parseInt(tmp[0]);
		int h = Integer.parseInt(tmp[1]);
		
		String[] tmp2 = br.readLine().split(" ");
		int xi = Integer.parseInt(tmp2[0]);
		int yi = Integer.parseInt(tmp2[1]);
		
		int t = Integer.parseInt(br.readLine());
		
		int x = 0;
		int y = 0;
		
		if(h-yi >= t) {
			y = yi + t;
		} else {
			
			int round = ( t - (h-yi) );
			
			if (round/h == 0 || (round/h)%2 ==0 ) {
				
				y = h - round%h;
				
			} else {
				y = round%h;
			}
		}
		
		if(w-xi >= t) {
			x = xi + t;
		} else {
			
			int round = ( t - (w-xi) );
			
			if (round/w == 0 || (round/w)%2 ==0 ) {
				
				x = w - round%w;
				
			} else {
				x = round%w;
			}
		}

		
		
		System.out.printf("%d %d", x, y);
		
		
	}
}
