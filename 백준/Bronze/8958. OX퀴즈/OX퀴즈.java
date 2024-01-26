import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(bf.readLine());

		for (int test_case = 1; test_case <= T; test_case++) {

			String quiz = bf.readLine();
			int serialOCount = 0;
			int totalPoint = 0;

			for (int i = 0; i < quiz.length(); i++) {
				if (Character.toString(quiz.charAt(i)).equals("O") && i == quiz.length() - 1) {
					serialOCount++;
					totalPoint += serialOCount;
				} else if (Character.toString(quiz.charAt(i)).equals("O")) {
					serialOCount++;
					totalPoint += serialOCount;
				} else {
					serialOCount = 0;
				}

			}

			System.out.println(totalPoint);

		}

	}

}