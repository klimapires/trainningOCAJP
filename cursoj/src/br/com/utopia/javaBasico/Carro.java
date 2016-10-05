package br.com.utopia.javaBasico;

public class Carro {
	
	protected String nome;
	
	protected void exibeVelocidade(){
		System.out.println("A velocidade de uma " + nome + " é de 380 km/h.");
	}

	public static void main(String[] args) {
		
		Carro c = new Carro();
		c.nome = "Ferrari";
		c.exibeVelocidade();

	}

}
