package aplicação;

import java.util.Locale;
import java.util.Scanner;

import entidade.triangulo;

public class programa {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		triangulo x, y;
		 x = new triangulo();
		 y = new triangulo();
		
		 System.out.println("Insira os valores do tringulo x: ");
		 x.a = sc.nextDouble();
		 x.b = sc.nextDouble();
		 x.c = sc.nextDouble();
		 System.out.println("Insira os valores do tringulo y: ");
		 y.a = sc.nextDouble();
		 y.b = sc.nextDouble();
		 y.c = sc.nextDouble();
		 
		double areax = x.area();
		double areay = y.area();
		 
		 System.out.printf("Triangulo X area: %.4f%n", areax);
		 System.out.printf("Triangulo Y area: %.4f%n", areay);
		 
		 if (areax > areay) {
			 System.out.println("Maior: X");
		 }else {
			 System.out.println("Maior: Y");
		 }
		sc.close();
		
	}
}
