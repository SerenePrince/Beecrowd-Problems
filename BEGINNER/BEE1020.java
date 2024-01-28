import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BEE1020 {

	private static final int DAYS_IN_YEAR = 365;
	private static final int DAYS_IN_MONTH = 30;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int days = Integer.parseInt(br.readLine());
		System.out.printf("%d ano(s)%n", days / DAYS_IN_YEAR);
		days %= DAYS_IN_YEAR;
		System.out.printf("%d mes(es)%n", days / DAYS_IN_MONTH);
		days %= DAYS_IN_MONTH;
		System.out.printf("%d dia(s)%n", days);
	}
}