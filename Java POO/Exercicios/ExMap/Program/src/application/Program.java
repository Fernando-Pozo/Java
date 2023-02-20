package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Map;
import java.util.TreeMap;

public class Program {
	public static void main(String[] args) {
		
		
		Map<String, Integer> votacao = new TreeMap<>();
		
		String path = "E:\\temp\\in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			while(line != null) {
				
				String[] fields = line.split(",");
				String name = fields[0];
				Integer votos = Integer.parseInt(fields[1]);
				
				
				if(votacao.containsKey(name)) {
					int votosSofar = votacao.get(name);
					votacao.put(name, votos + votosSofar);
				} else {
					votacao.put(name, votos);
				}
				
				
				line = br.readLine();
			}
				
			for(String key: votacao.keySet()) {
				System.out.println(key + ": " + votacao.get(key));
			}
			
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
}
