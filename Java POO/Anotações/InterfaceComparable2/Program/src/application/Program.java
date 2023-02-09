package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

import entities.Employer;

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		List<Employer> list = new ArrayList<Employer>();
		
		String path = "E:\\temp\\hardcode.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();
			while (line != null) {
				String func[] = line.split(",");
				list.add(new Employer(func[0], Double.valueOf(func[1]).doubleValue()));
				line = br.readLine();
			}
			
			Collections.sort(list);
			
			for(Employer lista : list) {
				System.out.println(lista.getNome() + " , " + lista.getSalario());
			}
			
		}catch (IOException e) {
			e.getStackTrace();
		}
		
	}
}
