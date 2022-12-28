package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainException;

public class Program {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		try {
			System.out.print("Room number: ");
			int number = sc.nextInt();
			System.out.print("Check-in date (dd/MM/yyyy): ");
			String checkinS =  sc.next();
			LocalDate checkin = LocalDate.parse(checkinS, fmt);
			System.out.print("Check-out date (dd/MM/yyyy): ");
			String checkOutS =  sc.next();
			LocalDate checkOut = LocalDate.parse(checkOutS, fmt);
			
		
			Reservation reservation = new Reservation(number, checkin, checkOut);
			System.out.println("Reservation " + reservation);
			
			System.out.println();
			System.out.println("Enter data to update the reservation: ");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkinS =  sc.next();
			checkin = LocalDate.parse(checkinS, fmt);
			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkOutS =  sc.next();
			checkOut = LocalDate.parse(checkOutS, fmt);
					
			reservation.updateDates(checkin, checkOut);
			System.out.println("Reservation " + reservation);
		}
		catch (DateTimeParseException e) {
			System.out.println("Invalid date format");
		}
		catch (DomainException e) {
			System.out.println("Error in reservation: " + e.getMessage());
		}
		catch(RuntimeException e) {
			System.out.println("Unexpected error");
		}
				
		
		sc.close();
	}
}
