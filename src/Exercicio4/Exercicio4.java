package Exercicio4;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Cliente cliente1;
		cliente1 = new Cliente();
		cliente1.setNome("Ivo, Mestre");
		cliente1.setIdade(20);
		cliente1.setCidade("Alphavile");
		cliente1.setNascimento("27/10/1999");
		cliente1.setCPF("125.786.657-85");
		
		cliente1.exibirDados();
		
		Funcionario funcionario1;
		funcionario1 = new Funcionario();
		funcionario1.setNome("Ivo, Mestre");
		funcionario1.setIdade(20);
		funcionario1.setCidade("Alphavile");
		funcionario1.setNascimento("27/10/1999");
		funcionario1.setMatricula(1746052);
		
		funcionario1.exibirDados();

	}
}
