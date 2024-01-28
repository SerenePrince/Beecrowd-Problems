import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BEE1011 {

	private static final double PI = 3.14159;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double R = Double.parseDouble(br.readLine());
		double VOLUME = (4.0 / 3.0) * PI * R * R * R;
		System.out.printf("VOLUME = %.3f%n", VOLUME);
	}
}