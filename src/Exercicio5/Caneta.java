package Exercicio5;

public class Caneta implements Escrever{
	
	private String ehFeitoDe;
	private String escreveCom;
	
	public Caneta (String material, String tipoDeEscrita) {
		this.ehFeitoDe = material;
		this.escreveCom = tipoDeEscrita;
	}

	@Override
	public void escrever() {
		System.out.println("Caneta Azul eh feita de " + this.ehFeitoDe + " e esta escrevendo com " + this.escreveCom + ";");
	}
	

}
