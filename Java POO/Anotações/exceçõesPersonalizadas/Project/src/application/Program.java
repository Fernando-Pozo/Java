package application;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import model.entities.Reservation;

public class Program {
	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.print("Room number: ");
		int number = sc.nextInt();
		System.out.print("Check-in date (dd/MM/yyyy): ");
		String checkinS =  sc.next();
		LocalDate checkin = LocalDate.parse(checkinS, fmt);
		System.out.print("Check-out date (dd/MM/yyyy): ");
		String checkOutS =  sc.next();
		LocalDate checkOut = LocalDate.parse(checkOutS, fmt);
		
		if (checkOut.isBefore(checkin)){
			System.out.println("Error in reservation: Check-out date must be after check-in date");
		}else {
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
			
			LocalDate now = LocalDate.now();
			if (checkin.isBefore(now) || checkOut.isBefore(now) ) {
				System.out.println("Error in reservation: Reservation dates for update must be future dates");
			}else if(checkOut.isAfter(now)) {
				System.out.println("Error in reservation: Check-out date must be after check-in date");
			}else {
				reservation.updateDates(checkin, checkOut);
				System.out.println("Reservation " + reservation);
			}
		}
		
		sc.close();
	}
}
