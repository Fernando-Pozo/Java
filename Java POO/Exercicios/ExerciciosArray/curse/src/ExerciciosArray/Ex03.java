package ExerciciosArray;

import java.util.Locale;
import java.util.Scanner;

import entidades.Pessoa;

public class Ex03 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos pessoas voce quer digitar ?");
		int n = sc.nextInt();
		
		Pessoa[] vect = new Pessoa[n];
		
		double media = 0;
		for(int i = 0; i < vect.length; i++) {
			System.out.println("Dados da  °" + (i+1) + " pessoa: " );
			sc.nextLine();
			String nome = sc.nextLine();
			int idade = sc.nextInt();
			double altura = sc.nextDouble();
			vect[i] = new Pessoa(nome, idade, altura);
			media += vect[i].getAltura();
		}
		
		double alturaMedia = media / vect.length;
		System.out.printf("Altura média: %.2f%n", alturaMedia);
		System.out.println("Pessoas com menos de 16 anos: ");
		for(int i = 0; i < vect.length; i++) {
			if(vect[i].getIdade() < 16) {
				System.out.println(vect[i].getNome());
			}
		}
		
		sc.close();
	}
}
