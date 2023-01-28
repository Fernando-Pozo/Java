package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.lista;

public class Program {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<lista> list = new ArrayList<>();
		
		System.out.println("Digite o caminho do primeiro arquivo :");
		String caminho = sc.nextLine(); 
		
		System.out.println("Digite o caminho do segundo arquivo :");
		String caminho2 = sc.nextLine(); 
		
		File caminhoFile = new File(caminho);
		File caminhoFile2 = new File(caminho2);
		
		String caminhodapasta = caminhoFile.getParent();
		
		String caminhonovoarquivo = caminhodapasta + "\\arquivo3.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(caminhoFile))) {
					
			try(BufferedReader br2 = new BufferedReader(new FileReader(caminhoFile2))){
			
				String itemtxt = br.readLine();
				while(itemtxt != null) {
					String item = itemtxt;
					list.add(new lista(item));
					itemtxt = br.readLine();
				}
				
				String itemtxt1 = br2.readLine();
				while(itemtxt1 != null) {
					String item = itemtxt1;
					list.add(new lista(item));
					itemtxt1 = br2.readLine();
				}
				
				
			}catch (IOException e) {
				e.getStackTrace();
			}
		
		}catch (IOException e) {
			e.getStackTrace();
		}
		
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(caminhonovoarquivo))){
			
			for(lista item: list) {	
				bw.write(item.getProduto());
				bw.newLine();
			}
			
		}catch(IOException e) {
			e.getStackTrace();
		}
		
		sc.close();
	}
}
