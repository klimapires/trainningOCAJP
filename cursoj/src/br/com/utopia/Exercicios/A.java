package br.com.utopia.Exercicios;

class B {
	int c;
	void c (int c){
		this.c = c;
	}
}

class A {

	public static void main(String[] args) {
		
		B b = new B();
		b.c = 10;
		
		System.out.println(b.c);
		
		b.c(30);
		
		System.out.println(b.c);


/*class B {
	int v = 15;
}

class A {

	public static void main(String[] args) {
		
		B x = new B();
		B y = x;
		
		y.v++;
		x.v++;
		B z = y;
		z.v--;
		
		System.out.println(x.v + y.v + z.v); //imprime 48.
*/						
/*		int x = 15;
		int y = x; // x = 15		
		y++; // y = 16
		x++; // x = 16
		int z = y; // z = 16
		z--; // z = 15
		System.out.println(x+y+z); //imprime 47.
*/	}

}
