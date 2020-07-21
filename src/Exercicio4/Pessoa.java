package Exercicio4;

public abstract class Pessoa {

	private String nome;
	private int idade;
	private String cidade;
	private String nascimento;
	
	
	//SETs
	public String setNome(String nomeToSet) {
		return this.nome = nomeToSet;
	}
	public int setIdade(int idadeToSet) {
		return this.idade = idadeToSet;
	}
	public String setCidade(String cidadeToSet) {
		return this.cidade = cidadeToSet;
	}
	public String setNascimento(String nascimentoToSet) {
		return this.nascimento = nascimentoToSet;
	}
	
	//GETs
	public String getNome() {
		return this.nome;
	}
	public int getIdade() {
		return this.idade;
	}
	public String getCidade() {
		return this.cidade;
	}
	public String getNascimento() {
		return this.nascimento;
	}
	
	//METHODs
	public void exibirDados() {
		System.out.println("Nome: " + getNome() + ";");
		System.out.println("Idade: " + getIdade() + ";");
		System.out.println("Cidade: " + getCidade() + ";");
		System.out.println("Nacimento: " + getNascimento() + ";");
		
	}
	
}

