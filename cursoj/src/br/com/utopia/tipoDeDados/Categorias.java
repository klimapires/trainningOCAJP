package br.com.utopia.tipoDeDados;

public class Categorias {
	//#01 - Categoria numérica
	byte b = 127;
	short s = 32767;
	int i = 2147483647;
	long l = 9223372036854775807L;
	
	//Como representar o numero 267 ou outro numero em outras bases.
	int dec = 267; //base decimal.
	int ii = 0b100001011; //base binária = 267.
	int iii = 0413; // base octal = 267.
	int iiii = 0x10B; // Base Hexadecimal = 267.
	
	//#02 - Categoria Ponto Flutuante
	float f = 3.40282347e+38f;
	double d = 1.7976931348623157e+308;
	
	//#03 - Categoria caracter
	char h = 65535; // = ?
	char h1 = 'A';
	char h2 = '\u03A2'; //código tabela Unicode
	
	//#04 - Categoria Boolean
	boolean boo = false;
	boolean boo2 = true;
	
	public static void main (String[] args){
		
		Categorias cat = new Categorias();
		System.out.println(cat.b);
		System.out.println(cat.s);
		System.out.println(cat.i);
		System.out.println(cat.l);
		System.out.println(cat.dec);
		System.out.println(cat.ii);
		System.out.println(cat.iii);
		System.out.println(cat.iiii);
		System.out.println(cat.h);
		System.out.println(cat.h1);
		System.out.println(cat.h2);
		System.out.println(cat.boo);
		System.out.println(cat.boo2);
	}
}
