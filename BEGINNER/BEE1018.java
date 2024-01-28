import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BEE1018 {

	private static final int[] BANKNOTES = { 100, 50, 20, 10, 5, 2, 1 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		System.out.println(N);
		for (int i = 0; i < BANKNOTES.length; i++) {
			System.out.printf("%d nota(s) de R$ %d,00%n", N / BANKNOTES[i], BANKNOTES[i]);
			N %= BANKNOTES[i];
		}
	}
}