import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BEE1041 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		double X = Double.parseDouble(st.nextToken());
		double Y = Double.parseDouble(st.nextToken());
		if (X > 0 && Y > 0) {
			System.out.println("Q1");
		} else if (X < 0 && Y > 0) {
			System.out.println("Q2");
		} else if (X < 0 && Y < 0) {
			System.out.println("Q3");
		} else if (X > 0 && Y < 0) {
			System.out.println("Q4");
		} else if (X == 0 && Y != 0) {
			System.out.println("Eixo Y");
		} else if (X != 0 && Y == 0) {
			System.out.println("Eixo X");
		} else {
			System.out.println("Origem");
		}
	}
}