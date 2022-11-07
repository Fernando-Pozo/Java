package entities;

public class Retangulo {
	
	public double largura, altura;
	
	public double Area() {
		return this.largura * this.altura;
	}
	
	public double Perimetro() {
		return this.largura + this.altura + this.largura + this.altura;
	}
	
	public double Diagonal() {
		return Math.sqrt(Math.pow(this.largura, 2) + Math.pow(this.altura, 2));
	}
	
	public String toString() {
		return "Area = " + String.format("%.2f", Area())
		+ " Perimetro = " + String.format("%.2f", Perimetro())
		+ " Diagonal = " + String.format("%.2f", Diagonal());
	}
}
