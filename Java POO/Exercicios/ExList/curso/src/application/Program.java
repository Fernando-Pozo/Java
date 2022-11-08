package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.empregados;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos empregados voce ira registrar ?");
		int n = sc.nextInt();

		List<empregados> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			System.out.println("Empregado #" + (i + 1));
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salario: ");
			double salario = sc.nextDouble();

			empregados emp = new empregados(id, name, salario);

			list.add(emp);
		}

		System.out.println();
		System.out.print("Enter the employee id that will have salary increase : ");
		int idsalary = sc.nextInt();

		empregados emp = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);

		if (emp == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			// list.get(pos).increaseSalary(percent);
			emp.increaseSalary(percent);
		}

		System.out.println();
		System.out.println("List of employees:");
		for (empregados e : list) {
			System.out.println(e);
		}
		sc.close();
	}

	public static Integer position(List<empregados> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

	public static boolean hasId(List<empregados> list, int id) {
		empregados emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}
