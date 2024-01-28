import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BEE1007 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		int D = Integer.parseInt(br.readLine());
		int DIFERENCA = (A * B) - (C * D);
		System.out.printf("DIFERENCA = %d%n", DIFERENCA);
	}
}