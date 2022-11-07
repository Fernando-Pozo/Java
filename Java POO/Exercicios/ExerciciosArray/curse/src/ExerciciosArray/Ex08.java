package ExerciciosArray;

import java.util.Locale;
import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos elementos vai ter o vetor ?");
		int n = sc.nextInt();

		int[] vect = new int[n];

		int mediapar = 0, media = 0, par = 0;
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
			if(vect[i] % 2 == 0) {
				media += vect[i];
				par += 1;
			}
		}
		
		if(par == 0) {
			System.out.println("NENHUM NUMERO PAR");
		}else {
			mediapar = media / par;
			System.out.println("MEDIA DOS PARES = " + mediapar);
		}

		sc.close();

	}

}
