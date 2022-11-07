package entities;

public class Funcionario {
	
	public String nome;
	public Double salarioBruto, taxa, porcentagem;
	
	public double salarioLiquido(){
		return this.salarioBruto - this.taxa;
	}
	
	public double incrementoSalario() {
		
		return (((this.salarioBruto / 100) * this.porcentagem ) + this.salarioBruto) - this.taxa;

	}
}
