package ExerciciosArray;

import java.util.Locale;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros voce vai digitar ?");
		int n = sc.nextInt();
		while (n > 10) {
			System.out.println("O numero não pode ser maior que 10, digite novamente:");
			n = sc.nextInt();
		};
		int[] vect = new int[n];
		
		for(int i =0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		System.out.println("NUMEROS NEGATIVOS");
		for(int i =0; i < vect.length; i++) {
			if(vect[i] < 0) {
				System.out.println(vect[i]);
			}
		}
		
		sc.close();
	}
}