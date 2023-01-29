package application;

import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Scanner;

import entities.Aluguel;
public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com os dados do aluguel");
		System.out.print("Modelo do carro: ");
		String carro = sc.nextLine();
		System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
		LocalDateTime retirada = LocalDateTime.parse(sc.nextLine(), Aluguel.fmt);
		System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
		LocalDateTime Retorno = LocalDateTime.parse(sc.nextLine(), Aluguel.fmt);
		System.out.print("Entre com o preço por hora: ");
		Double precohora = sc.nextDouble();
		System.out.print("Entre com o preço por dia: ");
		Double precodia = sc.nextDouble();
		
		Aluguel aluguel = new Aluguel(carro, retirada, Retorno, precohora, precodia);
		
		System.out.println("FATURA:");
		System.out.println("Pagamento basico: " + aluguel.Pagamento());
		System.out.println("Imposto: " + aluguel.tax());
		System.out.println("Pagamento total: " + aluguel.total());
		
		sc.close();	
	}

}
