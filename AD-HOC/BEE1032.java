import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BEE1032 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			int n = Integer.parseInt(br.readLine());
			if (n == 0) {
				break;
			}
			System.out.println(josephus(n, 2) + 1);
		}
	}

	private static int josephus(int n, int k) {
		if (n == 1) {
			return 0;
		} else {
			return (josephus(n - 1, nextPrime(k)) + k) % n;
		}
	}

	private static int nextPrime(int num) {
		num++;
		while (!isPrime(num)) {
			num++;
		}
		return num;
	}

	private static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}