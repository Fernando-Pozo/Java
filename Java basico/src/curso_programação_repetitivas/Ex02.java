package curso_programação_repetitivas;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = 1, y = 1;

		while (x != 0 && y != 0) {
			System.out.println("Informe o x :");
			x = sc.nextInt();
			System.out.println("Informe o y :");
			y = sc.nextInt();
			if (x > 0 & y > 0) {
				System.out.println("primeiro");
			} else if (x < 0 & y > 0) {
				System.out.println("Segundo");
			} else if (x < 0 & y < 0) {
				System.out.println("terceiro");
			} else if (x > 0 & y < 0) {
				System.out.println("Quarto");
			}
		}

		sc.close();
	}
}
