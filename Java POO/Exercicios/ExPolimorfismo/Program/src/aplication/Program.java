package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.println("Enter the number of employees:" );
		int NumberEmployees = sc.nextInt();
		
		for(int i = 0; i < NumberEmployees; i++) {
			System.out.println("Employee #" + (i+1) + "data:" );
			System.out.println("Outsourced (y/n)?");
			char resp = sc.next().charAt(0);
			if(resp == 'y' || resp == 'Y') {
				System.out.println("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.println("Hours: ");
				Integer Hours = sc.nextInt();
				System.out.println("Value per hour: ");
				Double valuePerHour = sc.nextDouble();
				System.out.println("Additional charge: ");
				Double Additional = sc.nextDouble();
				
				list.add(new OutsourcedEmployee(name, Hours, valuePerHour, Additional));
				
			}else {
				System.out.println("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.println("Hours: ");
				Integer Hours = sc.nextInt();
				System.out.println("Value per hour: ");
				Double valuePerHour = sc.nextDouble();
			
				list.add(new Employee(name, Hours, valuePerHour));
			}
		}
		
		System.out.println("PAYMENTS:");
		for(Employee emp : list) {
			System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
		}
		
		sc.close();
	}
}
