package entities;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Aluguel {

	public static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
	
	
	private String carro;
	private LocalDateTime retirada;
	private LocalDateTime retorno;
	private Double PrecoHora;
	private Double PrecoDia;
	private Double tax;
	private Double basicp;
	private Double total;

	public Aluguel(String carro, LocalDateTime tempoInicial, LocalDateTime tempofinal, Double precoInicial,
			Double precoFinal) {
		super();
		this.carro = carro;
		this.retirada = tempoInicial;
		this.retorno = tempofinal;
		PrecoHora = precoInicial;
		PrecoDia = precoFinal;
	}

	public String getCarro() {
		return carro;
	}

	public void setCarro(String carro) {
		this.carro = carro;
	}

	public LocalDateTime getTempoInicial() {
		return retirada;
	}

	public void setTempoInicial(LocalDateTime tempoInicial) {
		this.retirada = tempoInicial;
	}

	public LocalDateTime getTempofinal() {
		return retorno;
	}

	public void setTempofinal(LocalDateTime tempofinal) {
		this.retorno = tempofinal;
	}

	public Double getPrecoInicial() {
		return PrecoHora;
	}

	public void setPrecoInicial(Double precoInicial) {
		PrecoHora = precoInicial;
	}

	public Double getPrecoFinal() {
		return PrecoDia;
	}

	public void setPrecoFinal(Double precoFinal) {
		PrecoDia = precoFinal;
	}
	
	
	public LocalDateTime getRetorno() {
		return retorno;
	}

	public void setRetorno(LocalDateTime retorno) {
		this.retorno = retorno;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}
	

	public Double getBasicp() {
		return basicp;
	}

	public void setBasicp(Double basicp) {
		this.basicp = basicp;
	}

	public Double Pagamento(){
		Long dif = Duration.between(retirada, retorno).toHours();
		Long difmin = Duration.between(retirada, retorno).toMinutes();
		Long difd = Duration.between(retirada, retorno).toDays();
		if(dif < 12) {
			if(difmin > 0) {
				this.basicp = PrecoHora * (dif + 1);
			}else {
				 this.basicp = PrecoHora * dif;
			}
		}
		if(difd > 1) {
			if(dif > 0) {
				 this.basicp = PrecoDia * (difd + 1);
			}else {
				 this.basicp = PrecoDia * difd;
			}
		}
		return basicp;
	}
	
	public double tax() {
		Long difd = Duration.between(retirada, retorno).toDays();
		if(difd > 1) {
			this.tax = basicp * 0.15;
		}else {
			this.tax = basicp * 0.2;
		}
		
		return tax;
	}
	
	public double total() {
		return basicp + tax;
	}
	
}
