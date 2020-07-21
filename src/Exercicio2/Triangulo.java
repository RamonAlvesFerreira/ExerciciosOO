package Exercicio2;

public class Triangulo {
	
	private double base;
	private double altura;
	
	public double getAltura() {
		return this.altura;
	}
	public double getBase() {
		return this.base;
	}
	public double setAltura(double alturaToSet) {
		return this.altura = alturaToSet;
	}
	public double setBase(double baseToSet) {
		return this.base = baseToSet;
	}
	public double calcularAreaTriangulo(double alturaToCalc, double baseToCalc) {
		
		return (baseToCalc * alturaToCalc) / 2;
		
	}
	
}
