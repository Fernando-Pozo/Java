package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employeer;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter full file path: ");
		String path = sc.nextLine();	
		
		System.out.println("Enter salary: ");
		Double value = sc.nextDouble();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
		
			List<Employeer> list = new ArrayList<>();
			String line = br.readLine();
			while(line != null) {		
				String fields[] = line.split(",");
				list.add(new Employeer(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}
			
			Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
			
			List<String> email = list.stream()
					.filter(p -> p.getSalary() > value)
					.map(p -> p.getEmail())
					.sorted(comp)
					.collect(Collectors.toList());
			
			System.out.println("Email of people whose salary is more than " + value);
			email.forEach(System.out::println);
			
			
			Double sum = list.stream()
					.filter(p -> p.getName().toUpperCase().charAt(0) == 'M')
					.map(p -> p.getSalary())
					.reduce(0.0,(x, y) -> x + y);
			System.out.println("Sum of salary of people whose name starts with 'M': " + sum);
			
		} catch (IOException e) {
			System.out.println("Error " + e.getMessage());
		} 
		
		sc.close();
	}

}
