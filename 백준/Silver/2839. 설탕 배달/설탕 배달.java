import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(bf.readLine());
		int i = N/5;
		
		int minimum = 2000;
		
		if(N%3 == 0) {
			minimum = N/3;
		}
		if(N%5==0 && N/5 < minimum) {
			minimum = N/5;
		}
		
		
		
		while(  (  ( N - (5*i) )%3 != 0 ) &&  i>0  ) {
			i--;
		}
		
		if( (i + ( N - (5*i) )/3) < minimum && ( N - (5*i) )%3 == 0 ) {
			minimum = i + ( N - (5*i) )/3;
		}
		
		if(minimum == 2000) {
			System.out.println(-1);
		} else {
			System.out.println(minimum);
		}
	}

}