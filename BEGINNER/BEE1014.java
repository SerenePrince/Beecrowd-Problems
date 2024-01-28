import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BEE1014 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());
		double Y = Double.parseDouble(br.readLine());
		System.out.printf("%.3f km/l%n", X / Y);
	}
}