package Exercicio5;

public class Lapis implements Escrever{
	
	private String ehFeitoDe;
	private String escreveCom;
	
	public Lapis (String material, String tipoDeEscrita) {
		this.ehFeitoDe = material;
		this.escreveCom = tipoDeEscrita;
	}
	@Override
	public void escrever() {
		System.out.println("Lapis eh feita de " + this.ehFeitoDe + " e esta escrevendo com " + this.escreveCom + ";");
	}

}
