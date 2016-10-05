package br.com.utopia.tipoDeDados;

public class Variavel1 {
	
	int valor;

	public static void main(String[] args) {
		
		Variavel1 referencia = new Variavel1();
		referencia.valor = 10; //bx10 esta o valor 10.
		Variavel1 referencia2 = referencia;//bx10 esta o valor
		
		
		System.out.println(referencia.valor); //bx10 --> 10
		System.out.println(referencia2.valor);//bx10 --> 10
		
		int idade = 20; //valor de 20 - atribui o valor ao endereço de memoria da variável.
		
		int idade2 = idade; // atribui uma cópia ao endereço de memoria da variável.
		
		idade += 5;
		
		System.out.println(idade);
		System.out.println(idade2);
	}
}
