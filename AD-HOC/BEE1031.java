import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BEE1031 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			int N = Integer.parseInt(br.readLine());
			if (N == 0) {
				break;
			}
			int m = 1;
			while (true) {
				int result = 0;
				for (int i = 1; i < N; i++) {
					result = (result + m) % i;
				}
				if (result != 11) {
					m++;
				} else {
					break;
				}
			}
			System.out.println(m);
		}
	}
}