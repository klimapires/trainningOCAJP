package br.com.utopia.javaBasico;

public class Funcionario {
	String nome;
	int idade;
	int cpf;
	
	public Funcionario(){
		this.nome = "Kleber";
		this.idade = 28;
		this.cpf = 123456;
	}
	
	public Funcionario(String novoNome, int novaIdade, int novoCpf){
		this.nome = novoNome;
		this.idade = novaIdade;
		this.cpf = novoCpf;
	}
	
	public Funcionario(String novoNome){
		this.nome = novoNome;
		this.idade = 24;
		this.cpf = 1234567;
	}
}
