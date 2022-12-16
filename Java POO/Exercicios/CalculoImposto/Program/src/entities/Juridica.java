package entities;

public class Juridica extends Imposto{
	
	
	private int numeroFunc;
	
	public Juridica() {}
	
	public Juridica(String nome, Double rendaAnual, int numeroFunc) {
		super(nome, rendaAnual);
		this.numeroFunc = numeroFunc;
	}

	public int getNumeroFunc() {
		return numeroFunc;
	}

	public void setNumeroFunc(int numeroFunc) {
		this.numeroFunc = numeroFunc;
	}

	@Override
	public Double calcImposto() {
		Double valor = null;
		
		if(getNumeroFunc() <= 10) {
			valor = ((getRendaAnual()/100) * 16);
		}else {
			valor = ((getRendaAnual()/100) * 14);
		}
		
		return valor;
	}

}
