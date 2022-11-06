package ExerciciosArray;

import java.util.Locale;
import java.util.Scanner;

import entidades.Aluno;

public class Ex09 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
		Aluno[] vect = new Aluno[10];
		
		System.out.println("Quantos quartos vão ser alugados ?");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("Aluguel #" + (i+1));
			System.out.printf("Nome: ");
			String nome = sc.nextLine();
			System.out.printf("Email: ");
			String email = sc.nextLine();
			System.out.printf("Quarto: ");
			int quarto = sc.nextInt();
			vect[quarto] = new Aluno(nome, email, quarto);
		}
		
		System.out.println("Quartos alugados: ");
		for(int i = 0; i < vect.length; i++) {
			if(vect[i] != null) {
				System.out.println(vect[i].getQuarto() + ": " + vect[i].getNome() + ", " + vect[i].getEmail());
			}
		}
		
		sc.close();
	}
}
