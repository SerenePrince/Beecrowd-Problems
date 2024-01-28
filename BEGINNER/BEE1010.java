import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BEE1010 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int p1Code = Integer.parseInt(st.nextToken());
		int p1Units = Integer.parseInt(st.nextToken());
		double p1Price = Double.parseDouble(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int p2Code = Integer.parseInt(st.nextToken());
		int p2Units = Integer.parseInt(st.nextToken());
		double p2Price = Double.parseDouble(st.nextToken());
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", (p1Units * p1Price) + (p2Units * p2Price));
	}
}