import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int idx = 0;

		Map<Character, String> shortcut = new LinkedHashMap<>();

		out: for (int i = 0; i < N; i++) {
			String inputline = br.readLine();
			
			String[] input = inputline.split(" ");

			// 단어의 첫 문자부터 확인
			for (int j = 0; j < input.length; j++) {
				char tmp = input[j].charAt(0);
				if (tmp != ' ' && !shortcut.containsKey(tmp) && !shortcut.containsKey(Character.toLowerCase(tmp))
						&& !shortcut.containsKey(Character.toUpperCase(tmp))) {

					String tmpStr = "";
					for (int k = 0; k < input.length; k++) {
						if (k != j) {
							tmpStr += input[k];
						} else {
							String tmpStr0 = "[" + Character.toString(input[k].charAt(0)) + "]" + input[k].substring(1, input[k].length());
							tmpStr += tmpStr0;
						}
						
						if (k != input.length - 1) {
							tmpStr += " ";
						}
					}

					shortcut.put(tmp, tmpStr);
					continue out;
				}
			}
			// 중간 문자 확인
			for (int j = 0; j < inputline.length(); j++) {
				if (inputline.charAt(j) != ' ' && !shortcut.containsKey(inputline.charAt(j))
						&& !shortcut.containsKey(Character.toUpperCase(inputline.charAt(j)))
						&& !shortcut.containsKey(Character.toLowerCase(inputline.charAt(j)))) {

					String tmpStr = "";
					for (int k = 0; k < inputline.length(); k++) {
						if (k != j) {
							tmpStr += Character.toString(inputline.charAt(k));
						} else {
							String tmpStr0 = "[" + inputline.charAt(k) + "]";
							tmpStr += tmpStr0;
						}
					}

					shortcut.put(inputline.charAt(j), tmpStr);
					continue out;
				}

			}
			shortcut.put( (char) (++idx+'0'), inputline);
		}

		for (Character key : shortcut.keySet()) {
			String value = shortcut.get(key);
			System.out.println(value);
		}
	}
}