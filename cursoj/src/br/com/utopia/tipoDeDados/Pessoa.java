package br.com.utopia.tipoDeDados;

public class Pessoa {
	
	String nome;
	double nota1;
	double nota2;
	double mediaAluno;
	
	public void mediaAluno (double n1, double n2){
		this.nota1 = n1;
		this.nota2 = n2;
		mediaAluno = (this.nota1+this.nota2)/2;
		System.out.println(this.nome + " sua média é: " + this.mediaAluno);
	}
	
	public double mediaAluno(String nome, double...notas){
		double mediaTurma = 0;
		
		for (int i = 0; i < notas.length; i++){
			mediaTurma += notas[i];			
		}
		return mediaTurma/notas.length;
	}

}
