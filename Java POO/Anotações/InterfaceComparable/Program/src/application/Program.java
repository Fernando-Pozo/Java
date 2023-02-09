package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entites.Pessoas;

public class Program {
	public static void main(String[] args) {
		
		String path = "E:\\temp\\hardcode.txt";
		
		List<Pessoas> pessoas = new ArrayList<Pessoas>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();
			while(line != null) {
				pessoas.add(new Pessoas(line));
				line = br.readLine();
			}
			
			Collections.sort(pessoas);
			
			for(Pessoas ler : pessoas) {
				System.out.println(ler.getNome());
			}
			
		} catch (IOException e) {
			e.getStackTrace();
		}
		
		
	}
}
