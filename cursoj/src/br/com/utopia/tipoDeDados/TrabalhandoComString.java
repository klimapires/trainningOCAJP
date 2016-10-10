package br.com.utopia.tipoDeDados;

public class TrabalhandoComString {
	public static void main(String[] args) {
		//Formas de criar Strings e manipulá-las.
		
		String nome = "Java";
		String nome2 = new String("Java");
		char[] nome3 = new char [] {'J' + 'a' + 'v' + 'a'};
		String nome4 = new String(nome3);
		StringBuilder nome5 = new StringBuilder("Java"); //Pode ser usado o StringBuffer
		String nome6 = new String(nome5);
		
		String nome7 = "Kleber";
		String nome8 = "meu nome é: " + " " + "Kleber Lima";
		System.out.println(nome8);
		
		System.out.println(2 + 7 + " Olá meu nome é Kleber e tenho " + 2 + 7); //ATENÇÃO NA ORDEM DA CONCATENAÇÃO
		
		String nome9 = "kleber";
		
		nome9.toUpperCase();
		System.out.println(nome9); //Uma string não muda seu valor, diferente da classe Stringbuider/StringBuffer
		
		System.out.println(nome9.charAt(3)); //Acessa a posição do Array de String
		System.out.println(nome9.length()); // Devolve a quantidade de elementos do array de String
		
		System.out.println("Teste".isEmpty()); // Verifica se o Array está vazio.
		System.out.println("".isEmpty());
		System.out.println(" ".isEmpty());
		
		System.out.println("                  Kleber Lima                 ".trim()); //remove espaços da String
		
		String nome10 = "Kleber";
		System.out.println(nome10.replace("K", "C")); //Substituir uma String por outra.
		System.out.println(nome10);
		System.out.println(nome10.substring(0,  2)); // Inicia umm array a partir de uma posição ou intervalo.
		System.out.println("kleber".equals("Kleber")); // Devolve true se as Strings forem iguais ou false se diferentes.
		System.out.println("kleber".equalsIgnoreCase("Kleber")); //Nesse caso é como no anterior, ignorando as letras Maiscúlas.
		
		System.out.println("a".compareTo("a")); //igual a zero
		System.out.println("a".compareTo("b")); //retorna negatvo
		System.out.println("d".compareTo("b")); //retorna positivo
		System.out.println("a".compareToIgnoreCase("A"));
		System.out.println("a".compareTo("A")); //retorna positivo ???
		
		String nome11 = "Desvendando o Java";
		
		System.out.println(nome11.indexOf("J"));
		System.out.println(nome11.lastIndexOf("a"));
		System.out.println(nome11.indexOf("a", 2));
		System.out.println(nome11.indexOf("a", 8));
		System.out.println(nome11.startsWith("Desven")); //Retorna true
		System.out.println(nome11.startsWith("Java")); //retorna false
		System.out.println(nome11.endsWith("Desven")); //false
		System.out.println(nome11.endsWith("Java")); //true
	}
}
