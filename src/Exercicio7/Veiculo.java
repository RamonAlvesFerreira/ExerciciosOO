package Exercicio7;

public class Veiculo {

	
	private String nome;
	private int numRodas;
	private double capacidaDeTanque;
	private double combustivelNoTanque;
	private double consumoPorLitro;
	
	//SETs
	public String setNome(String nomeToSet) {
		return this.nome = nomeToSet;
	}
	public int setNumRodas(int numRodasToSet) {
		return this.numRodas = numRodasToSet;
	}
	public double setCapacidadeDeTanque(int capacidaDeTanqueToSet) {
		return this.capacidaDeTanque = capacidaDeTanqueToSet;
	}
	public double setConsumoPorLitro(int consumoPorLitroToSet) {
		return this.consumoPorLitro = consumoPorLitroToSet;
	}
	
	//GETs
	public double getCombustivelNoTanque() {
		return this.combustivelNoTanque;
	}
	public double getConsumoPorLitro() {
		return this.consumoPorLitro;
	}
	
	//METHODs
	public void abastecer(double quantCombustivel) {
		
		if((this.combustivelNoTanque + quantCombustivel) == this.capacidaDeTanque) {
			this.combustivelNoTanque = capacidaDeTanque;
		}else {
			this.combustivelNoTanque = quantCombustivel;
		}
	}
	public void autonomia(double combustivelNoTanqueToSet, double consumoPorLitroToSet) {
		System.out.println("O veiculo pode rodar " + (combustivelNoTanqueToSet / consumoPorLitroToSet) + "km com o combustivel atual!");
	}
}
