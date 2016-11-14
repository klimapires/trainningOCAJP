 package br.com.utopia.tipoDeDados;

public class StringQueMuda {
	public static void main(String[] args) {
/*		String nome = "Jos�";
		nome += " Jo�o";
		nome += " e Maria"; --> M�todo n�o indicado para utilizar concatena��o.
		
		System.out.println(nome);*/
		
		StringBuffer sb1 = new StringBuffer("21923412838"); //219.234.128-38
		sb1.insert(3, '.');
		sb1.insert(7, '.');
		sb1.insert(11, '-');
		sb1.append(" este ");
		sb1.append("� meu CPF ");
		System.out.println(sb1);
		
		StringBuffer sb2 = new StringBuffer(60);
		System.out.println(sb2);
		
		StringBuffer sb3 = new StringBuffer(sb1);
		
		//m�todo append adiciona outros valores � String.
		sb3.append("e o meu nome � Kleber");
		sb3.append('.');
		System.out.println(sb3);
		
		StringBuffer sb4 = new StringBuffer();
		sb4.append(sb3);
		System.out.println(sb4);
		sb4.delete(29, 51);
		System.out.println(sb4);
		
		StringBuilder sb5 = new StringBuilder();
		sb5.append(new Pessoa());
		System.out.println(sb5);
		
		StringBuilder sb6 = new StringBuilder("Kleber");
		
		//m�todo reverse inverte o valor das Strings.
		sb6.reverse();
		System.out.println(sb6);
		
		StringBuilder sb7 = new StringBuilder("Curso Java"); 
		
		//m�todo substring e subSequence pega determinado do intervalo de uma string sem alterar seu valor.
		System.out.println(sb7.substring(3, 8));
		System.out.println(sb7.subSequence(3, 8));
		System.out.println(sb7);
	}
}
