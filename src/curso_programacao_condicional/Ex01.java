package curso_programacao_condicional;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
	
		int x;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro");
		x = sc.nextInt();
		
		if(x >= 0) {
			System.out.println("Numero Positivo");
		}else {
			System.out.println("Numero Negativo");
		}
		sc.close();
	}

}
