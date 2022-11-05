package ExerciciosArray;

import java.util.Locale;
import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		double media = 0;
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
			
			media += vect[i];
		}
		
		double mediaf = media / vect.length;
		
		System.out.printf("MEDIA DO VETOR %.3f%n", mediaf);
		System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
		for(int i = 0; i < vect.length; i++) {
			if(vect[i] < mediaf) {
				System.out.println(vect[i]);
			}
		}
		

		sc.close();
	}
}
