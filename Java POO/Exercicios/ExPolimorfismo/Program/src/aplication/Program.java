package aplication;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Employee> emp = new ArrayList<>();
		
		System.out.println("Enter the number of employees:" );
		int NumberEmployees = sc.nextInt();
		
		for(int i = 0; i < NumberEmployees; i++) {
			System.out.println("Employee #" + (i+1) + "data:" );
			System.out.println("Outsourced (y/n)?");
			char resp = sc.nextLine().charAt(0);
			if(resp == 'y' || resp == 'Y') {
				System.out.println("Name: ");
				String name = sc.nextLine();
				System.out.println("Hours: ");
				Integer Hours = sc.nextInt();
				System.out.println("Value per hour: ");
				Double valuePerHour = sc.nextDouble();
				System.out.println("Additional charge: ");
				Double Additional = sc.nextDouble();
				
				Employee employee = new OutsourcedEmployee(name, Hours, valuePerHour, Additional);
				emp.add(employee);
				
			}else {
				System.out.println("Name: ");
				String name = sc.nextLine();
				System.out.println("Hours: ");
				Integer Hours = sc.nextInt();
				System.out.println("Value per hour: ");
				Double valuePerHour = sc.nextDouble();
			
				Employee employee = new Employee(name, Hours, valuePerHour);
				emp.add(employee);
			}
		}
		
		
		
		sc.close();
	}
}
