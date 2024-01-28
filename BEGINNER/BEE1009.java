import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BEE1009 {

	private static final double COMMISSION = 0.15;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name = br.readLine();
		double salary = Double.parseDouble(br.readLine());
		double totalSales = Double.parseDouble(br.readLine());
		System.out.printf("TOTAL = R$ %.2f%n", salary + (totalSales * COMMISSION));
	}
}