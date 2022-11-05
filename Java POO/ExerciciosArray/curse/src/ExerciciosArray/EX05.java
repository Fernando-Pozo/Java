package ExerciciosArray;

import java.util.Locale;
import java.util.Scanner;

public class EX05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		double[] vect = new double[n];

		double maior = 0;
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
			if(vect[i] > maior) {
				 maior = vect[i];
			}
		}
		
		System.out.println("MAIOR VALOR = " + maior);
		for (int i = 0; i < vect.length; i++) {
			if(vect[i] == maior) {
				System.out.println("POSIÇÃO DO MAIOR VALOR = " + i);
			}
		}

		sc.close();
	}

}
