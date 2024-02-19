package contaa;

import java.util.Scanner;

import conta.model.Conta;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variáveis
		String nomeTitular = null, tipoConta = null, statusConta = null;
		int numeroConta = 0;
		float saldo = 0;
		
		Scanner leia = new Scanner(System.in);
		
		//Aqui, importamos a classe "Conta" para fazer uso de seus atributos
		Conta novaConta = new Conta(nomeTitular, tipoConta, statusConta, numeroConta, saldo);
		
		//Atribuindo valores aos atributos com o uso dos Setters
		System.out.println("Digite o nome do titular: ");
		nomeTitular = leia.nextLine();
		novaConta.setNomeTitular(nomeTitular);
		
		System.out.println("Digite o tipo de conta: ");
		tipoConta = leia.nextLine();
		novaConta.setTipoConta(tipoConta);
		
		System.out.println("Digite o status da conta: ");
		statusConta = leia.nextLine();
		novaConta.setStatusConta(statusConta);
		
		System.out.println("Digite o número da conta: ");
		numeroConta = leia.nextInt();
		novaConta.setNumeroConta(numeroConta);
		
		System.out.println("Digite o saldo conta: ");
		saldo = leia.nextFloat();
		novaConta.setSaldo(saldo);
		
		//Imprimindo os valores com o uso dos Getters
		System.out.println("\nNome do titular: " + novaConta.getNomeTitular());
		System.out.println("Tipo de conta: " + novaConta.getTipoConta());
		System.out.println("Status da conta: " + novaConta.getStatusConta());
		System.out.println("Número da conta: " + novaConta.getNumeroConta());
		System.out.println("Saldo da conta: " + novaConta.getSaldo());
		
	}

}
