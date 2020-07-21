package Exercicio5;

public class PenaMosquito  implements Escrever{
	
	private String ehFeitoDe;
	private String escreveCom;
	
	public PenaMosquito (String material, String tipoDeEscrita) {
		this.ehFeitoDe = material;
		this.escreveCom = tipoDeEscrita;
	}
	public void escrever() {
		System.out.println("Pena Mosquito eh feita de " + this.ehFeitoDe + " e esta escrevendo com " + this.escreveCom + ";");
	}

}
