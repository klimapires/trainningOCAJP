package br.com.utopia.tipoDeDados;

public class PessoaTeste {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.nome = "Kleber";
		p.mediaAluno(10, 8.5);
		
		Pessoa p2 = new Pessoa();
		double n = p2.mediaAluno("Kleber", new double[]{3,5,6,8,9,8}); //O var args pode-se passar um array como par�metro.
		
		System.out.println("A m�dia da turma �: " + n);
		System.out.println("A m�dia da turma �: " + p2.mediaAluno("Kleber2", 3,5,10,8,9,10)); //O var args aceita tbm passagem por valor
	}
}
