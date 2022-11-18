package entities;

import java.time.LocalDate;

public class HoraContrato {
	
	private LocalDate date;
	private Double valorPorHora;
	private Integer Horas;
	
	public HoraContrato() {
		
	}

	public HoraContrato(LocalDate date, Double valorPorHora, Integer horas) {
		this.date = date;
		this.valorPorHora = valorPorHora;
		Horas = horas;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Double getValorPorHora() {
		return valorPorHora;
	}

	public void setValorPorHora(Double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}

	public Integer getHoras() {
		return Horas;
	}

	public void setHoras(Integer horas) {
		Horas = horas;
	}
	
	public double totalValue() {
		return valorPorHora * Horas;
	}
	
}
