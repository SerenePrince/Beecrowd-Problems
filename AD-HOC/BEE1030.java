import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BEE1030 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int NC = Integer.parseInt(br.readLine());
		for (int t = 1; t <= NC; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			int result = josephus(n, k);
			System.out.printf("Case %d: %d%n", t, result + 1);
		}
	}

	private static int josephus(int n, int k) {
		if (n == 1) {
			return 0;
		} else {
			return (josephus(n - 1, k) + k) % n;
		}
	}
}