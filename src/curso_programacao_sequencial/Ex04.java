package curso_programacao_sequencial;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		int nfuncionario;
		double horas, valor, salario;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o numero do funcionario");
		nfuncionario = sc.nextInt();
		System.out.println("Numero de horas trabalhadas ? ");
		horas = sc.nextDouble();
		System.out.println("Qual o valor da hora ?");
		valor = sc.nextDouble();
		
		salario = horas * valor;
		
		System.out.println("Number = " + nfuncionario);
		System.out.printf("Salary = U$ %.2f%n", salario);
		
		sc.close();
	}

}
