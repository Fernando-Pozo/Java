package curso_programacao_condicional;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		int A, B;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro Valor :");
		A = sc.nextInt();
		System.out.println("Digite o Segundo Valor :");
		B = sc.nextInt();
		if(A % B == 0 || B % A == 0) {
			System.out.println("São Multiplos");
		}else {
			System.out.println("Não São Multiplos");
		}
		sc.close();
	}

}
