import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BEE1008 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int employeeNumber = Integer.parseInt(br.readLine());
		int hoursWorked = Integer.parseInt(br.readLine());
		double payPerHour = Double.parseDouble(br.readLine());
		System.out.printf("NUMBER = %d%n", employeeNumber);
		System.out.printf("SALARY = U$ %.2f%n", hoursWorked * payPerHour);
	}
}