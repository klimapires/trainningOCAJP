package br.com.pacoteExterno;

import br.com.utopia.javaBasico.Carro;

public class CarroExterno extends Carro{
	
	void teste(){
		nome = "Ferrari3";
		exibeVelocidade();
		
	}

	public static void main(String[] args) {
		
		CarroExterno c = new CarroExterno();
		
		c.teste();
	

	}

}
