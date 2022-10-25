package curso_programação_repetitivas_for;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			double z = sc.nextDouble();

			double media = (x * 2.0 + y * 3.0 + z * 5.0) / 10.0;

			System.out.printf("%.1f%n", media);
		}
		sc.close();
	}

}
