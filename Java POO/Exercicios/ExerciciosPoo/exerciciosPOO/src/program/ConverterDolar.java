package program;

import java.util.Locale;
import java.util.Scanner;

import entities.currencyConverter;

public class ConverterDolar {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o valor do dolar hoje ?");
		currencyConverter.dolar = sc.nextDouble();
		System.out.println("Quantos dolares voce quer comprar ?");
		currencyConverter.comprarDolar = sc.nextDouble();
		System.out.println();
		
		System.out.println("O valor em reais : " + currencyConverter.converter());
		
		sc.close();
	}
}
