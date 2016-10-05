package br.com.utopia.tipoDeDados;

public class Carros {
	String modelo;
	int ano;
	
	Carros(){
		ano = 2015;
	}
	
	void modelo(){
		modelo = "Ferrari Enzo";
		System.out.println(modelo);
	}
	
	void setCarro(String modelo){
		this.modelo = modelo;
		System.out.println(this.modelo);
	}
	
	public static void main (String[] args){
		
		Carros c = new Carros();
		
		c.setCarro("Corsa");
		c.modelo();
		c.modelo = "Captiva";
		System.out.println(c.modelo);
		c.ano = 2010;
		System.out.println(c.ano);
	}
	

}
