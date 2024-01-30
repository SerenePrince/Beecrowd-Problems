import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BEE1043 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		double A = Double.parseDouble(st.nextToken());
		double B = Double.parseDouble(st.nextToken());
		double C = Double.parseDouble(st.nextToken());
		if (A + B > C && B + C > A && A + C > B) {
			System.out.printf("Perimetro = %.1f%n", A + B + C);
		} else {
			System.out.printf("Area = %.1f%n", (A + B) / 2 * C);
		}
	}
}