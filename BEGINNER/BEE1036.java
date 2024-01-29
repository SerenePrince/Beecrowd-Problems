import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BEE1036 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		double A = Double.parseDouble(st.nextToken());
		double B = Double.parseDouble(st.nextToken());
		double C = Double.parseDouble(st.nextToken());
		double discriminant = (B * B) - (4 * A * C);
		if (discriminant < 0 || A == 0) {
			System.out.println("Impossivel calcular");
		} else {
			double R1 = (-B + Math.sqrt(discriminant)) / (2 * A);
			double R2 = (-B - Math.sqrt(discriminant)) / (2 * A);
			System.out.printf("R1 = %.5f%n", R1);
			System.out.printf("R2 = %.5f%n", R2);
		}
	}
}