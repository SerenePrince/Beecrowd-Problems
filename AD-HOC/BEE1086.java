import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class BEE1086 {

	private static int L, K, X, N, M;
	private static int[] count1 = new int[10005];
	private static int[] count2 = new int[10005];
	private static TreeSet<Integer> ts = new TreeSet<>(Collections.reverseOrder());

	static int countPlanks(int k, int sum, boolean b) {
		Iterator<Integer> it = ts.descendingIterator();
		int d, count = 0;
		while (k > 0 && it.hasNext()) {
			int num = it.next();
			N = num;
			d = sum - N;
			if (b) {
				if (count1[N] <= 0 || d < 0 || (d == N ? (count1[d] - 1) <= 0 : count1[d] <= 0)) {
					continue;
				}
			}
			if (!b) {
				if (count2[N] <= 0 || d < 0 || (d == N ? (count2[d] - 1) <= 0 : count2[d] <= 0)) {
					continue;
				}
			}
			if (b) {
				count1[d]--;
				count1[N]--;
			} else {
				count2[d]--;
				count2[N]--;
			}
			count += (d != 0) ? 2 : 1;
			k--;
		}
		if (k > 0) {
			return Integer.MAX_VALUE;
		}
		return count;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			if (N == 0 && M == 0) {
				break;
			}
			Arrays.fill(count1, 0);
			Arrays.fill(count2, 0);
			ts.clear();
			L = Integer.parseInt(br.readLine());
			K = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < K; i++) {
				X = Integer.parseInt(st.nextToken());
				ts.add(X);
				count1[X]++;
				count2[X]++;
			}
			int result = Integer.MAX_VALUE;
			if ((N * 100) % L == 0) {
				result = Math.min(result, countPlanks((N * 100) / L, M, true));
			}
			if ((M * 100) % L == 0) {
				result = Math.min(result, countPlanks((M * 100) / L, N, false));
			}
			if (result == Integer.MAX_VALUE || result < 0) {
				System.out.println("impossivel");
			} else {
				System.out.println(result);
			}
		}
	}
}