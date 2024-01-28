import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BEE1019 {

	private static final int SECONDS_IN_HOUR = 3600;
	private static final int SECONDS_IN_MINUTE = 60;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int hours = N / SECONDS_IN_HOUR;
		int minutes = (N % SECONDS_IN_HOUR) / SECONDS_IN_MINUTE;
		int seconds = N % SECONDS_IN_MINUTE;
		System.out.printf("%01d:%01d:%01d%n", hours, minutes, seconds);
	}
}