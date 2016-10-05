package br.com.utopia.javaBasico;

public class Calculo implements ValorDePi{
	
	double soma;
	
	public static void main(String[] args) {
		Calculo c = new Calculo();
		c.exibeValorDePi();
		c.exibeSoma(5, 100);
		
	}

	public void exibeValorDePi() {
		System.out.println(ValorDePi.PI);
	}

	public void exibeSoma(double num1, double num2) {
		this.soma = num1 + num2;
		System.out.println(this.soma);
	}
}