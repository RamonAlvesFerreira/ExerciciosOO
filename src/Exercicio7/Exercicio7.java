package Exercicio7;

public class Exercicio7 {
	
	public static void main(String[] args) {
		
		//Objeto1
		Veiculo veiculo1;
		veiculo1 = new Veiculo();
		veiculo1.setNome("Astra");
		veiculo1.setNumRodas(4);
		veiculo1.setCapacidadeDeTanque(25);
		veiculo1.setConsumoPorLitro(2);
		
		veiculo1.abastecer(20);
		veiculo1.autonomia(veiculo1.getCombustivelNoTanque(), veiculo1.getConsumoPorLitro());
		
		//Objeto2
		Veiculo veiculo2;
		veiculo2 = new Veiculo();
		veiculo2.setNome("Vectra");
		veiculo2.setNumRodas(4);
		veiculo2.setCapacidadeDeTanque(45);
		veiculo2.setConsumoPorLitro(4);
		
		veiculo2.abastecer(30);
		veiculo2.autonomia(veiculo2.getCombustivelNoTanque(), veiculo2.getConsumoPorLitro());
	
	

	}

}
