package entities;

public class empregados {
	
	private Integer id;
	private String nome;
	private double salario;
	
	public empregados(int id, String nome, double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void increaseSalary(double percentage) {
		salario += salario * percentage / 100.0;
	}
	
	@Override
	public String toString() {
		return id + ", " + nome + ", " + String.format("%.2f", salario);
	}
	
}
