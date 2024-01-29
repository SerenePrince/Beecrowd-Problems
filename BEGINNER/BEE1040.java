import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BEE1040 {
	
	private static final double EPSILON = 1e-9;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		float sum = 0;
		sum += Float.parseFloat(st.nextToken()) * 2;
		sum += Float.parseFloat(st.nextToken()) * 3;
		sum += Float.parseFloat(st.nextToken()) * 4;
		sum += Float.parseFloat(st.nextToken()) * 1;
		float average = sum / 10;
		System.out.printf("Media: %.1f%n", average);
		if (average < 5 - EPSILON) {
			System.out.println("Aluno reprovado.");
		} else if (average >= 5 - EPSILON && average <= 6.9 + EPSILON) {
			System.out.println("Aluno em exame.");
			float exam = Float.parseFloat(br.readLine());
			System.out.printf("Nota do exame: %.1f%n", exam);
			average = (average + exam) / 2;
			if (average <= 4.9 - EPSILON) {
				System.out.println("Aluno reprovado.");
				System.out.printf("Media final: %.1f%n", average);
			} else {
				System.out.println("Aluno aprovado.");
				System.out.printf("Media final: %.1f%n", average);
			}
		} else {
			System.out.println("Aluno aprovado.");
		}
	}
}