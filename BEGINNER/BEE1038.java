import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BEE1038 {

	private static final double[] TABLE = { -1, 4.00, 4.50, 5.00, 2.00, 1.50 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int X = Integer.parseInt(st.nextToken());
		int Y = Integer.parseInt(st.nextToken());
		System.out.printf("Total: R$ %.2f%n", TABLE[X] * Y);
	}
}