import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Node {
	char data;
	int num;
	Node left;
	Node right;

	Node() {
	}

	Node(char data) {
		this.data = data;
	}
}
public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		Node[] nodes = new Node[N+1];
		
		
		for(int i=1; i<N+1; i++) {
			nodes[i] = new Node();
			nodes[i].num = i;
			//nodes[i].data = i;
		}
		for (int i = 1; i <= N; i++) {
			String[] input = br.readLine().split(" ");
			char parent = input[0].charAt(0);
			nodes[parent - 64].data = parent;
			
			if(!input[1].equals(".")) {
				char childLeft = input[1].charAt(0);
				nodes[parent - 64].left = nodes[childLeft - 64];
				
			} 
			
			if (!input[2].equals(".")) {
				char childRight = input[2].charAt(0);
				nodes[parent - 64].right = nodes[childRight - 64];
			} 
		}
		preOrder(nodes[1]);
		System.out.println();
		inOrder(nodes[1]);
		System.out.println();
		postOrder(nodes[1]);
		
	}
	// 전위
	static void preOrder(Node node) {
		if(node == null) {
			return;
		}
		System.out.print(node.data);
		preOrder(node.left);
		preOrder(node.right);
	}
	
	static void inOrder(Node node) {
		if(node == null) {
			return;
		}
		inOrder(node.left);
		System.out.print(node.data);
		inOrder(node.right);
	}
	
	static void postOrder(Node node) {
		if(node == null) {
			return;
		}
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.data);
	}
}