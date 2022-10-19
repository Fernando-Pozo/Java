package curso_programacao_condicional;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		int x;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro :");
		x = sc.nextInt();
		if(x % 2 == 0) {
			System.out.println("Este numero e par");
		}else {
			System.out.println("Este numero e impar");
		}
		sc.close();
		
	}

}
