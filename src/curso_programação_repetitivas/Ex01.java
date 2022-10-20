package curso_programação_repetitivas;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		int x = 0, senha = 2002;
		Scanner sc = new Scanner(System.in);

		while (x != senha) {
			System.out.println("Informe a senha :");
			x = sc.nextInt();
			if (x != senha) {
				System.out.println("Senha Invalida");
			}
		}
		System.out.println("Acesso Permitido");

		sc.close();
	}

}
