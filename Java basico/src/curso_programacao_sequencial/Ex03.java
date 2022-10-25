package curso_programacao_sequencial;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		int a, b, c, d, diferenca;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 4 valores inteiros :");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		
		diferenca = ((a * b) - (c * d));
		
		System.out.println("A diferença do produto é : " + diferenca);
		sc.close();
	}

}
