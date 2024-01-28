import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BEE1006 {

	private static final double WEIGHT_A = 2;
	private static final double WEIGHT_B = 3;
	private static final double WEIGHT_C = 5;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double A = Double.parseDouble(br.readLine()) * WEIGHT_A;
		double B = Double.parseDouble(br.readLine()) * WEIGHT_B;
		double C = Double.parseDouble(br.readLine()) * WEIGHT_C;
		double MEDIA = (A + B + C) / (WEIGHT_A + WEIGHT_B + WEIGHT_C);
		System.out.printf("MEDIA = %.1f%n", MEDIA);
	}
}