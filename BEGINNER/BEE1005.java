import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BEE1005 {

	private static final double WEIGHT_A = 3.5;
	private static final double WEIGHT_B = 7.5;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double A = Double.parseDouble(br.readLine()) * WEIGHT_A;
		double B = Double.parseDouble(br.readLine()) * WEIGHT_B;
		double MEDIA = (A + B) / (WEIGHT_A + WEIGHT_B);
		System.out.printf("MEDIA = %.5f%n", MEDIA);
	}
}