package entities;

public class  currencyConverter {
	
	public static double dolar,comprarDolar;
	
	
	public static double converter() {
		return ((dolar * comprarDolar) + (((comprarDolar / 100) * 6) * dolar));
	};
	
}
