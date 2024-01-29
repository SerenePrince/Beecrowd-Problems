import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BEE1037 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double N = Double.parseDouble(br.readLine());
		if (N >= 0 && N <= 25) {
			System.out.println("Intervalo [0,25]");
		} else if (N > 25 && N <= 50) {
			System.out.println("Intervalo (25,50]");
		} else if (N > 50 && N <= 75) {
			System.out.println("Intervalo (50,75]");
		} else if (N > 75 && N <= 100) {
			System.out.println("Intervalo (75,100]");
		} else {
			System.out.println("Fora de intervalo");
		}
	}
}