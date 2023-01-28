package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ProgramWrite {
	public static void main(String[] args) {
		
		String[] lista = new String[] {"Banana", "Maça", "Pera", "Uva"};
		
		String path = "C:\\Users\\ferna\\eclipse-workspace\\curso_programacao\\Java POO\\Anotações\\FileReader\\Program\\lista.txt";
	
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			
			for(String linha : lista) {
				bw.write(linha);
				bw.newLine();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
