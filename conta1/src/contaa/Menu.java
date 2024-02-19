package contaa;

import conta1.model.Conta1;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Aqui, importamos a classe "Conta" para fazer uso de seus atributos
		Conta1 novaConta = new Conta1("Bianca", 123, 1, 2527, 50000000f);
		
		//Imprimindo os resultados de acordo com a classe do model
		novaConta.visualizar();
		novaConta.setAgenciaConta(456);
		System.out.println(novaConta.getAgenciaConta());
		
		if(novaConta.sacar(1000)) {
			System.out.println("Saque efetuado com sucesso! O novo saldo é de: " + novaConta.getSaldo());
		} else {
			System.out.println("O saldo é insuficiente!");
		}
	
		novaConta.depositar(5000);
		System.out.println("O novo saldo é de: " + novaConta.getSaldo());
		
	}

}
