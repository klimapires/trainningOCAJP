package br.com.utopia.tipoDeDados;
class Carro{
	
	
}

public class Variavel {

	int ano;
	byte b;
	long l;
	float f;
	double d;
	char ch;
	boolean boo;
	Carro motor;
	String nome;
	
	public static void main(String[] args) {
		
		Variavel c = new Variavel();
		System.out.println(c.ano);
		System.out.println(c.b);
		System.out.println(c.l);
		System.out.println(c.f);
		System.out.println(c.d);
		System.out.println((c.ch == 0) + " aqui é um char");
		System.out.println(c.boo);
		System.out.println(c.motor);
		System.out.println(c.nome);
	}
		
		
		

}
