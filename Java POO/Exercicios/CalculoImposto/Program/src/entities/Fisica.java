package entities;

public class Fisica extends Imposto {
	
	
	private Double gastoComSaude;
	
	public Fisica() {}
	
	
	public Fisica(String nome, Double rendaAnual, Double gastoComSaude) {
		super(nome, rendaAnual);
		this.gastoComSaude = gastoComSaude;
	}

	
	public Double getGastoComSaude() {
		return gastoComSaude;
	}


	public void setGastoComSaude(Double gastoComSaude) {
		this.gastoComSaude = gastoComSaude;
	}


	@Override
	public Double calcImposto() {
		Double valor = null;
		if(getRendaAnual() < 20000.00) {
			valor = ((getRendaAnual()/100) * 15) - (getGastoComSaude()/100 * 50);
		}else if (getRendaAnual() > 20000.00) {
			valor = ((getRendaAnual()/100) * 25) - (getGastoComSaude()/100 * 50);
		}
		return valor;
	}

}
