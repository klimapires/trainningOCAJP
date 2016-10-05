package br.com.utopia.javaBasico;

import static java.lang.Math.*;
import static java.lang.System.out;

public class Matematica {
	
	static double raiz = 81;
	
	static void calculaRaiz(){
		out.println(sqrt(raiz));
	}
	
	static void exibeValorDePi(){
		out.println(PI);
	}
	
	
	public static void main (String[] args){
		
		/*Matematica m = new Matematica();
		m.calculaRaiz();
		m.exibeValorDePi();*/
		
		Matematica.calculaRaiz();
		Matematica.exibeValorDePi();
	}

}
