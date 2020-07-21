package Exercicio5;

public class Excercicio5 {
	
	public static void main(String[] args) {
		
		//Objeto1
		Caneta canetaAzul;
		canetaAzul = new Caneta("Plastico", "Tinta");
		canetaAzul.escrever();
		
		//Objeto2
		Lapis lapis8B;
		lapis8B = new Lapis("Madeira", "Grafite");
		lapis8B.escrever();
		
		//Objeto2
		PenaMosquito penaMosquitoTipo2;
		penaMosquitoTipo2 = new PenaMosquito("Metal", "Nanquim");
		penaMosquitoTipo2.escrever();
	}

}
