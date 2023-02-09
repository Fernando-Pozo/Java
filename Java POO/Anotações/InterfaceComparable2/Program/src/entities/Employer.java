package entities;

public class Employer implements Comparable<Employer> {
	
	private String nome;
	private Double salario;
	
	
	public Employer(String nome, Double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}

	@Override
	public int compareTo(Employer other) {
		return this.nome.compareTo(other.getNome());
	}
	
	
}
