import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BEE1021 {

	private static final int[] BANKNOTES = { 100, 50, 20, 10, 5, 2 };
	private static final int[] BANKCOINS = { 100, 50, 25, 10, 5, 1 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = (int) (Double.parseDouble(br.readLine()) * 100);
		System.out.println("NOTAS:");
		for (int banknote : BANKNOTES) {
			int notes = N / (banknote * 100);
			System.out.printf("%d nota(s) de R$ %d.00%n", notes, banknote);
			N %= banknote * 100;
		}
		System.out.println("MOEDAS:");
		for (int bankcoin : BANKCOINS) {
			int coins = N / bankcoin;
			if (bankcoin == 1) {
				coins += N % bankcoin;
			}
			System.out.printf("%d moeda(s) de R$ %.2f%n", coins, bankcoin / 100.0);
			N %= bankcoin;
		}
	}
}