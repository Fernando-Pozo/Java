package entities;

public class Conta {

	private String titular;
	private int numeroConta;
	private double saldoConta;
	private double taxaSaque = 5.0;
	public Conta(String titular, int numeroConta) {
		super();
		this.titular = titular;
		this.numeroConta = numeroConta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumeroConta() {
		return numeroConta;
	}
	
	public double getSaldoConta() {
		return saldoConta;
	}
	
	public void depositoInicial(double depositoInicial) {
		this.saldoConta += depositoInicial;
	}
	
	public void depositar(double valorDoDeposito) {
		 this.saldoConta += valorDoDeposito;
	}
	
	public void sacar(double valorDoSaque) {
		this.saldoConta -= (valorDoSaque + taxaSaque);
	}

}
