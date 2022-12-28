package model.entities;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import model.exceptions.DomainException;


public class Reservation {
	
	private Integer roomNumber;
	private LocalDate checkin;
	private LocalDate checkOut;
	
	private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public Reservation() {}

	public Reservation(Integer roomNumber, LocalDate checkin, LocalDate checkOut) {
		if(checkOut.isAfter(checkin)) {
			throw new DomainException("Check-out date must be after check-in date");
		}
		this.roomNumber = roomNumber;
		this.checkin = checkin;
		this.checkOut = checkOut;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public LocalDate getCheckin() {
		return checkin;
	}

	public LocalDate getCheckOut() {
		return checkOut;
	}

	public int duration() {
		Period periodo = Period.between(checkin, checkOut);
		int dias = periodo.getDays();
		return dias;
	}
	
	public void updateDates(LocalDate checkin, LocalDate checkout) {
		
		LocalDate now = LocalDate.now();
		if (checkin.isBefore(now) || checkOut.isBefore(now) ) {
			throw new DomainException("Reservation dates for update must be future dates");
		}
		if(checkOut.isAfter(checkin)) {
			throw new DomainException("Check-out date must be after check-in date");
		}
		this.checkin = checkin;
		this.checkOut = checkout;
	}
	
	@Override
	public String toString() {
		return "Room " 
			+ roomNumber 
			+ ", check-in "
			+ fmt.format(checkin)
			+ ", check-out "
			+ fmt.format(checkOut)
			+ ", "
			+ duration()
			+ " nights";
	}
}
