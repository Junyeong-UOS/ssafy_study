import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[][] boxes = new int[4][4];
		for(int i=0; i<4; i++) {
			String[] input = br.readLine().split(" ");
			for(int j=0; j<4; j++) {
				boxes[i][j] = Integer.parseInt(input[j]);
			}
		}

		int[][] whiteBoard = new int[100][100];
	

		System.out.println(paint(whiteBoard, boxes));
	}
	
	public static int paint(int[][] whiteBoard, int[][] boxes) {
		int area = 0;

		for (int i = 0; i <boxes.length; i++) {

			for (int j = boxes[i][0]; j <boxes[i][2]; j++) {
				for (int k = boxes[i][1]; k < boxes[i][3]; k++) {

					if (whiteBoard[j][k] == 0) {
						area++;
						whiteBoard[j][k] = 1;
					}
				}

			}

		}
		return area;
	}
}
