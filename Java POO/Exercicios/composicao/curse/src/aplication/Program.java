package aplication;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Departamento;
import entities.HoraContrato;
import entities.Worker;
import entities.enums.WorkerLevel;



public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o nome do departamento: ");
		String departmentName = sc.nextLine();
		System.out.println("Enter workr data ");
		System.out.println("Name: ");
		String workerName = sc.nextLine();
		System.out.println("Level: ");
		String workerLevel = sc.nextLine();
		System.out.println("Base salary: ");
		double baseSalary = sc.nextDouble();
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Departamento(departmentName));

		System.out.println("Quantos contratos tem este trabalhador ?");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Entre com o contrato #" + (i+1) + "data:");
			System.out.print("Date (DD/MM/YYYY): ");
			String data1 = sc.next();
			LocalDate contractDate = LocalDate.parse(data1, DateTimeFormatter.ofPattern("dd/MM/yyyy")); 
			System.out.print("Valor por hora: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duração (horas): ");
			int hours = sc.nextInt();
			HoraContrato contract = new HoraContrato(contractDate, valuePerHour, hours);
			worker.addContract(contract);
		}
		System.out.println();
		System.out.println("Entre com o mes e ano para calcular os ganhos (MM/YYYY)");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2)); 
		int year = Integer.parseInt(monthAndYear.substring(3)); 
		System.out.println("Name: " + worker.getName());
		System.out.println("Department" + worker.getDepartamento().getName());
		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
		sc.close();
	}
}
