package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class program {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String path = "D:\\temp\\arq.txt";
		List<Character> lista = new ArrayList<>();
		Character texto;
		
		do {
			
			System.out.print("Digite um caracter : ");
			texto = sc.next().charAt(0);
			if(texto != '0') {
				lista.add(texto);
			}
		} while (texto != '0');
		
		System.out.println("Fim do programa");
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			
			for(Character list: lista) {
				bw.write(list);
				bw.newLine();	
			}
			
		} catch (IOException e) {
			e.getStackTrace();
		}
		
	}
}
