package program;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Ex02program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario func = new Funcionario();
		
		System.out.println("Digite o nome do funcionario : ");
		func.nome = sc.nextLine();
		System.out.println("Digite o salario bruto : ");
		func.salarioBruto = sc.nextDouble();
		System.out.println("Digite o valor do imposto : ");
		func.taxa = sc.nextDouble();
		
		System.out.println("Funcionario :" + func.nome +", $ " + func.salarioLiquido());
		
		System.out.println("Quantos % voce quer aumentar do salario bruto : ");
		func.porcentagem = sc.nextDouble();
		
		System.out.println("Novo valor : "  + func.nome + ", $ " + func.incrementoSalario());
		sc.close();
	}

}
