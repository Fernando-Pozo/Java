package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	 
	List<Product> lista = new ArrayList<>();
	
	System.out.println("Digite o caminho do arquivo:");
	String caminho = sc.nextLine(); 
	
	File caminhoFile = new File(caminho);
	String sourceFolder = caminhoFile.getParent();
	
	boolean success = new File(sourceFolder + "\\out").mkdir();
		
	String targetFileStr = sourceFolder + "\\out\\summary.csv";
	
	try (BufferedReader br = new BufferedReader(new FileReader(caminho))){
		
		String itemCsv = br.readLine();
		while (itemCsv != null) {
			
			String[] fields = itemCsv.split(",");
			String name = fields[0];
			double price = Double.parseDouble(fields[1]);
			int quantity = Integer.parseInt(fields[2]);
			
			lista.add(new Product(name, price, quantity));
			
			itemCsv = br.readLine();
		}
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {
			
			for(Product item: lista) {
				bw.write(item.getNome() + "," + String.format("%.2f", item.total()));
				bw.newLine();
			}
			
		}catch (IOException e) {
			System.out.println("Error writing file: " + e.getMessage());
		}
		
	}catch(IOException e) {
		System.out.println("Error writing file: " + e.getMessage());
	}
	
	sc.close();
	}

}
