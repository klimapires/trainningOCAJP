package br.com.utopia.javaBasico;

public class FabricaTeste {
	public static void main(String[] args) {
		Fabrica kleber = new Fabrica();
		kleber.fabricarCarro();
		kleber.fabricarCarro();
		kleber.fabricarCarro();
		System.out.println("O funcionario kleber fabricou: " + kleber.carro);
		
		Fabrica teste = new Fabrica();
		teste.fabricarCarro();
		teste.fabricarCarro();
		System.out.println("O funcionario Teste fabricou: " + teste.carro);
		
		System.out.println("Total de carros fabricados " + Fabrica.totalDeCarros);
		
	}
}
