package curso_programacao_sequencial;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		int x, y, r;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor :");
		x = sc.nextInt();
		System.out.println("Digite o segundo valor :");
		y = sc.nextInt();
		
		r = x + y;
		
		System.out.println("A entrada de dados foi " + x + "+" + y);
		System.out.println("Resultado da soma : " + r);
		
		sc.close();
	}

}
