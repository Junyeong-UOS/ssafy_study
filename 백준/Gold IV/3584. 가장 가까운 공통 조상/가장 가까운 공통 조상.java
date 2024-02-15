import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Node {
	int num;
	Node left;
	Node right;
	Node parent;

	Node() {
	}

}

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {

			int V = sc.nextInt();

			int[] count = new int[V+1];
			Node[] nodes = new Node[V + 1];
			for (int i = 1; i < V + 1; i++) {
				nodes[i] = new Node();
				nodes[i].num = i;
			}

			for (int i = 1; i < V; i++) {
				int parent = sc.nextInt();
				int child = sc.nextInt();

				count[child]++;
				if (nodes[parent].left == null) {
					nodes[parent].left = nodes[child];
					nodes[child].parent = nodes[parent];
				} else {
					nodes[parent].right = nodes[child];
					nodes[child].parent = nodes[parent];
				}
			}
			int t1 = sc.nextInt();
			int t2 = sc.nextInt();
			
			
			int root=-1;
			for(int i=1; i<=V; i++) {
				if(count[i]==0) {
					root = i;
					break;
				}
			}
			
			Node target1 = nodes[t1];
			Node target2 = nodes[t2];
			List<Integer> par1 = new ArrayList<>();
			List<Integer> par2 = new ArrayList<>();
			while (target1.parent != null) {
				par1.add(target1.num);
				target1 = target1.parent;
			}
			
			while (target2.parent != null) {
				par2.add(target2.num);

				target2 = target2.parent;
			}
			par1.retainAll(par2);
			par1.add(root);
			System.out.printf("%d\n", par1.get(0));

		}

	}

	static void preOrder(Node node) {
		if (node == null) {
			return;
		}
		preOrder(node.left);
		preOrder(node.right);

	}
}