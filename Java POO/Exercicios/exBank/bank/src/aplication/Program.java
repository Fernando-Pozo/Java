package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double valorInicial = 0;
		System.out.println("------------------------------------");
		System.out.println("        BEM VINDO AO THE BANK ");
		System.out.println("       CADASTRE UMA NOVA CONTA ");
		System.out.println("-------------------------------------");
		System.out.println("Informe o nome do titular :");
		String titular = sc.nextLine();
		System.out.println("Informe o numero da conta :");
		int numeroConta = sc.nextInt();
		Conta conta = new Conta(titular, numeroConta);
		System.out.println("Deseja fazer um deposito inicial ? (S/N) ");
		char depositoIni = sc.next().charAt(0);
		if (depositoIni == 'S' || depositoIni == 's') {
			System.out.println("Digite o valor do deposito inicial :");
			valorInicial = sc.nextDouble();
			conta.depositoInicial(valorInicial);
		}
		System.out.println("-------------------");
		System.out.println("Conta bancaria :");
		System.out.println(
				  "Conta " 
				+ conta.getNumeroConta()
				+ ", Titular: " 
				+ conta.getTitular() 
				+ ", Saldo: $ "
				+ conta.getSaldoConta());
		System.out.println("-------------------");
		System.out.println("Digite qual valor voce quer depositar : ");
		double deposito = sc.nextDouble();
		conta.depositar(deposito);
		System.out.println("-------------------");
		System.out.println("Valor atualizado");
		System.out.println(
				  "Conta " 
				+ conta.getNumeroConta()
				+ ", Titular : " 
				+ conta.getTitular() 
				+ ", Saldo : $ "
				+ conta.getSaldoConta());
		System.out.println("-------------------");
		System.out.println("Digite qual valor voce quer sacar : ");
		double sacar = sc.nextDouble();
		conta.sacar(sacar);
		System.out.println("-------------------");
		System.out.println("Valor atualizado");
		System.out.println(
				  "Conta " 
				+ conta.getNumeroConta()
				+ ", Titular : " 
				+ conta.getTitular() 
				+ ", Saldo : $ "
				+ conta.getSaldoConta());
		System.out.println("-------------------");
		sc.close();
	}
}
