import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BEE1002 {
	
	private static final double PI = 3.14159;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double R = Double.parseDouble(br.readLine());
		System.out.printf("A=%.4f%n", PI * R * R);
	}
}