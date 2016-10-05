package br.com.utopia.tipoDeDados;

public class AlunoTeste {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		Aluno a = new Aluno(); ///Objeto 1
		a.nome = "Kleber";
		aluno.c1 = a; //referência indireta, não pode ser coletado pelo garbage collector
		a = new Aluno(); //Objeto 2
		aluno.c2 = a; //referência indireta, não pode ser coletado pelo garbage collector
		a.nome = "Kleber2";
		//a = null;
		
		/*if (15 > 10){
			Aluno b = new Aluno();
		}
		Aluno c;
		
		for(int i=0; i<10; i++ ){
			c = new Aluno();
		}*/
	
		
		System.out.println("Objeto = " + Aluno.contador);
		System.out.println(aluno.c1.nome);
		System.out.println(aluno.c2.nome);

	}

}
