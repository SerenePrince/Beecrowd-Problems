import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BEE1017 {

	private static final double FUEL = 12;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double time = Integer.parseInt(br.readLine());
		double speed = Integer.parseInt(br.readLine());
		System.out.printf("%.3f%n", time * speed / FUEL);
	}
}