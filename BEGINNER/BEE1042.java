import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BEE1042 {

	private static final int SIZE = 3;
	private static int[] input = new int[SIZE];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < SIZE; i++) {
			input[i] = Integer.parseInt(st.nextToken());
			sb.append(input[i] + "\n");
		}
		Arrays.sort(input);
		for (int i = 0; i < SIZE; i++) {
			System.out.println(input[i]);
		}
		System.out.print("\n" + sb);
	}
}