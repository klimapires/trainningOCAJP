package br.com.utopia.javaBasico;

public class Coffee {

	private void drink() {
		System.out.println("Pronto para beber!");
		
	}

	private void refill() {
		System.out.println("Caneca está vazia!");
		
	}

	private boolean isEmpty() {
		return false;
	}

	public static void main(String[] args) {
		
		Coffee coffee = new Coffee();
		
		if (coffee.isEmpty()){
			coffee.refill();
			
		}else{
			coffee.drink();
		}
	}
}
