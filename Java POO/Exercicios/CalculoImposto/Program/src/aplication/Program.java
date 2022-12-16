package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Fisica;
import entities.Imposto;
import entities.Juridica;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Imposto> list = new ArrayList<>();
		
		
		System.out.println("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Tax payer #" + (1+i) + " data: ");
			System.out.println("Individual or company (i/c)?");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			Double income = sc.nextDouble();
			if(type == 'i' | type == 'I'){
				System.out.print("Health expenditures: ");
				double health = sc.nextDouble();
				list.add(new Fisica(name, income, health));
			}else if (type == 'c' | type == 'C') {
				System.out.print("Number of employees: ");
				int number = sc.nextInt();
				list.add(new Juridica(name, income, number));
			}
		}
		
		System.out.println("TAXES PAID");
		for(Imposto imp: list) {
			System.out.println(imp.getNome() + ": $ " + imp.calcImposto() );
		}
	
		sc.close();
	}
}
