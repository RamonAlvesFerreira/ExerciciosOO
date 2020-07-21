package Exercicio4;

public class Funcionario extends Pessoa{

	private int matricula;
	
	//SETs
	public int setMatricula(int matriculaToSet) {
		return this.matricula = matriculaToSet;
	}
	
	//GETs
	public int getMatricula() {
		return this.matricula;
	}
	
	@Override
	public void exibirDados() {
		super.exibirDados();
		System.out.println("CPF: " + getMatricula() + ";");	
		
	}
}
