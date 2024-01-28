import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BEE1013 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int MaiorAB = (A + B + Math.abs(A - B)) / 2;
		MaiorAB = (MaiorAB + C + Math.abs(MaiorAB - C)) / 2;
		System.out.printf("%d eh o maior%n", MaiorAB);
	}
}