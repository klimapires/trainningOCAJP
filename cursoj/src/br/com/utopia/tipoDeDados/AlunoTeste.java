package br.com.utopia.tipoDeDados;

public class AlunoTeste {

	public static void main(String[] args) {
		Aluno a = new Aluno(); ///Objeto 1
		a.nome = "Kleber";
		a = new Aluno(); //Objeto 2
		a.nome = "Kleber2";
		//a = null;
		
/*		if (15 > 10){
			Aluno b = new Aluno();
		}
		Aluno c;
		
		for(int i=0; i<10; i++ ){
			c = new Aluno();
		}*/
	
		
		System.out.println("Objeto = " + Aluno.contador);
		System.out.println(a.nome);

	}

}
