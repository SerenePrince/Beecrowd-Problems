import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BEE1022 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		while (N-- > 0) {
			String[] input = br.readLine().split(" ");
			int N1 = Integer.parseInt(input[0]);
			int D1 = Integer.parseInt(input[2]);
			int N2 = Integer.parseInt(input[4]);
			int D2 = Integer.parseInt(input[6]);
			String operation = input[3];
			int X = 0, Y = 0;
			switch (operation) {
			case "+":
				X = (N1 * D2) + (N2 * D1);
				Y = (D1 * D2);
				break;
			case "-":
				X = (N1 * D2) - (N2 * D1);
				Y = (D1 * D2);
				break;
			case "*":
				X = (N1 * N2);
				Y = (D1 * D2);
				break;
			case "/":
				X = (N1 * D2);
				Y = (N2 * D1);
				break;
			}
			System.out.printf("%d/%d = ", X, Y);
			int gcd = gcd(Math.abs(X), Math.abs(Y));
            X /= gcd;
            Y /= gcd;
            if (Y < 0) {
                X = -X;
                Y = -Y;
            }
			System.out.printf("%d/%d%n", X, Y);
		}
	}

	public static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}
}