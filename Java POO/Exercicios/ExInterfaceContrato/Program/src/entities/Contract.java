package entities;

import java.time.LocalDate;
import java.util.ArrayList;

public class Contract {
	
	private Integer number;
	private LocalDate date;
	private Double totalValue;
	
	ArrayList<Installment> installments = new ArrayList<>();

	public Contract(Integer number, LocalDate date, Double totalValue, ArrayList<Installment> installments) {
		super();
		this.number = number;
		this.date = date;
		this.totalValue = totalValue;
		this.installments = installments;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}

	public ArrayList<Installment> getInstallments() {
		return installments;
	}

	public void setInstallments(ArrayList<Installment> installments) {
		this.installments = installments;
	}
}
