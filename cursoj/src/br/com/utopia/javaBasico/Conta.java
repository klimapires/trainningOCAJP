package br.com.utopia.javaBasico;

public class Conta {
	String cliente;
	double saldo;
	
	void exibeSaldo(){
		System.out.println(this.cliente + " seu saldo é R$ " + this.saldo);
	}
	
	void saca(double valor){
		if (this.saldo > valor){
			this.saldo -= valor;
			System.out.println(this.cliente + " seu saque foi efetuado com sucesso.");
		}else {
			System.out.println("Sem limite disponível para saque.");
		}
		
	}
	
	void deposito(double valor){		
		this.saldo += valor;
		System.out.println("Desposito efetuado com sucesso");
	}
	
	public static void main (String[] args){
		
		Conta c1 = new Conta();
		
		c1.cliente = "Kleber";
		c1.saldo = 1000;
		c1.exibeSaldo();
		c1.deposito(5000);
		c1.saca(1500);
		c1.exibeSaldo();
	}
	

}
