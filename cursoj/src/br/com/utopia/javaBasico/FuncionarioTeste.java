package br.com.utopia.javaBasico;

public class FuncionarioTeste {

	public static void main(String[] args) {
		
		Funcionario kleber = new Funcionario();
		
		System.out.println(kleber.nome);
		System.out.println(kleber.idade);
		System.out.println(kleber.cpf+"\n");
		
		Funcionario valdir = new Funcionario("Valdir", 45, 12345678);
		
		System.out.println(valdir.nome);
		System.out.println(valdir.idade);
		System.out.println(valdir.cpf+"\n");
		
		Funcionario herbert = new Funcionario("Herbert");
		
		System.out.println(herbert.nome);
		System.out.println(herbert.idade);
		System.out.println(herbert.cpf);
	}
}
