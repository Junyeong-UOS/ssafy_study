import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;



class node implements Comparable<node>{
	int x;
	int y;
	node(){}
	
	
	@Override
	public String toString() {
		return x+ " " +y;
	}


	@Override
	public int compareTo(node o) {
		// TODO Auto-generated method stub
		if(this.x == o.x) {
			return this.y - o.y;
		} 
		return this.x - o.x;
	}
	
	
}

public class Main {
	
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		node[] nodes = new node[N];

		for(int i=0; i<N; i++) {
			nodes[i] = new node();
		}
		
		for(int i=0; i<N; i++) {
			nodes[i].x = sc.nextInt();
			nodes[i].y = sc.nextInt();
		}
		
		Arrays.sort(nodes);
		
		for(int i=0; i<N; i++) {
			System.out.println(nodes[i].toString());
		}
		
	}

}