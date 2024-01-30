import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BEE1024 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		while (N-- > 0) {
			char[] line = br.readLine().toCharArray();
			for (int i = 0; i < line.length; i++) {
				if (Character.isLetter(line[i])) {
					line[i] += 3;
				}
			}
			int i = 0, j = line.length - 1;
			while (i < j) {
				char temp = line[i];
				line[i] = line[j];
				line[j] = temp;
				i++;
				j--;
			}
			for (i = line.length / 2; i < line.length; i++) {
				line[i]--;
			}
			System.out.println(new String(line));
		}
	}
}