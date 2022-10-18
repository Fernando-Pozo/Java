package curso_programacao_sequencial;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int codp;
		double valoru, Np;
		
		int codp2;
		double valoru2, Np2;
		
		double total;
		
		System.out.println("Codigo da peça  :");
		codp = sc.nextInt();
		System.out.println("Numero de peças :");
		Np = sc.nextDouble();
		System.out.println("Valor Unitario :");
		valoru = sc.nextDouble();
		
		System.out.println("Codigo da peça :");
		codp2 = sc.nextInt();
		System.out.println("Numero de peças :");
		Np2 = sc.nextDouble();
		System.out.println("Valor Unitario :");
		valoru2 = sc.nextDouble();
		
		total = ((Np * valoru) + (Np2 * valoru2));
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total );
		
		sc.close();
	}

}
