package curso_programacao_sequencial;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double raio, area;
		
		System.out.println("Digite o valor do raio :");
		raio = sc.nextDouble();
		
		area = 3.14159 * Math.pow(raio, 2);
		
		System.out.printf("A area desse ciruclo e %.4f%n", area);
		
		sc.close();
	}

}
