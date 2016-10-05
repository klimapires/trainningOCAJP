package br.com.utopia.javaBasico;

public class CarroNoMesmoPacote extends Carro{

	public static void main(String[] args) {
		
		Carro c = new Carro();
		
		c.nome = "Ferrari2";
		c.exibeVelocidade();

	}

}
