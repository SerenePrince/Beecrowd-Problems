import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BEE1120 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String D = st.nextToken();
			String N = st.nextToken();
			if (D.equals("0") && N.equals("0")) {
				break;
			}
			N = N.replaceFirst("^0+", "");
			if (N.contains(D)) {
				String result = N.replace(D, "").replaceFirst("^0+", "");
				System.out.println(result.isEmpty() ? 0 : result);
			} else {
				System.out.println(N);
			}
		}
	}
}