package Exercicio4;

public class Cliente extends Pessoa{
	
	private String cpf;
	
	//SETs
	public String setCPF(String cpfToSet) {
		return this.cpf = cpfToSet;
	}
	
	//GETs
	public String getCPF() {
		return this.cpf;
	}
	
	@Override
	public void exibirDados() {
		super.exibirDados();
		System.out.println("CPF: " + getCPF() + ";");	
		
	}
	


}
