package br.com.utopia.javaBasico;

public class Fabrica {
	float carro = 0;
	static float totalDeCarros;
	
	void fabricarCarro(){
		carro++;
		totalDeCarros++;
	}

}
