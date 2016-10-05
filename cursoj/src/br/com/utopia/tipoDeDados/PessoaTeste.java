package br.com.utopia.tipoDeDados;

public class PessoaTeste {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.nome = "Kleber";
		p.mediaAluno(10, 8.5);
		
		Pessoa p2 = new Pessoa();
		double n = p2.mediaAluno("Kleber", new double[]{3,5,6,8,9,8}); //O var args pode-se passar um array como parâmetro.
		
		System.out.println("A média da turma é: " + n);
		System.out.println("A média da turma é: " + p2.mediaAluno("Kleber2", 3,5,10,8,9,10)); //O var args aceita tbm passagem por valor
	}
}
