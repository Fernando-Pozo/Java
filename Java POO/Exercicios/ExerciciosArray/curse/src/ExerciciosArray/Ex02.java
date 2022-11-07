package ExerciciosArray;

import java.util.Locale;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos numeros voce quer digitar ?");
		int n = sc.nextInt();
		double soma = 0;

		
		double[] vect = new double[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
			soma += vect[i];
		}
		System.out.println("Valores: ");
		for (int i = 0; i < vect.length; i++) {
			System.out.printf("%.1f  ", vect[i]);
		}
		System.out.println("");
		System.out.println("SOMA: " + soma);
		double media = soma / vect.length;
		System.out.println("MEDIA: " + media);
		
		sc.close();
	}
}
