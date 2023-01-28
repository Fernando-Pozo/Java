package application;

import java.io.File;
import java.util.Scanner;

public class manipularpasta {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o caminho da pasta: ");
		String caminho = sc.nextLine();
		
		File path = new File(caminho);
		
		File[] pastas = path.listFiles(File::isDirectory);
		System.out.println("PASTAS");
		for(File pasta : pastas) {
			System.out.println(pasta);
		}
		
		File[] arquivos = path.listFiles(File::isFile);
		System.out.println("ARQUIVOS");
		for(File arquivo : arquivos) {
			System.out.println(arquivo);
		}
		
		boolean sucesso = new File(caminho + "\\Test").mkdir();
		System.out.println(sucesso);
	
	}
}
