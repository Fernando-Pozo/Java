package aplication;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exception.DomainException;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Holder: ");
			sc.nextLine();
			String holder = sc.nextLine();
			System.out.print("Inicial balance: ");
			Double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			Double limit = sc.nextDouble();
			
			Account acc = new Account(number, holder, balance, limit);
			
			System.out.print("Enter amount for witdraw: ");
			acc.withdraw(sc.nextDouble());
			
			System.out.println("New balance: " + acc.getBalance());
		}
		catch (DomainException  e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		catch(RuntimeException e) {
			System.out.println("Unexpected error");
		}
		
		sc.close();
	}
}
