package conta1.model;

public class Conta1 {
	
	//Adicionando os atributos da conta
	//Atributos escolhidos foram titular, número da conta, tipo de conta, 
	//saldo e status da conta
	private String nomeTitular;
	private int agenciaConta;
	private int tipoConta;
	private int numeroConta;
	private float saldo;
	
	//Construtor
	public Conta1(String nomeTitular, int agenciaConta, int tipoConta, int numeroConta, float saldo) {
		this.nomeTitular = nomeTitular;
		this.agenciaConta = agenciaConta;
		this.tipoConta = tipoConta;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}
	
	//Métodos Getters and Setters
	public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	public int getAgenciaConta() {
		return agenciaConta;
	}
	public void setAgenciaConta(int agenciaConta) {
		this.agenciaConta = agenciaConta;
	}
	public int getTipoConta() {
		return tipoConta;
	}
	public void setTipoConta(int tipoConta) {
		this.tipoConta = tipoConta;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	//Método para depositar dinheiro
	public void depositar(float valor) {
		this.setSaldo(this.saldo + valor);
	}
	
	//Método para sacar dinheiro
	public boolean sacar(float valor) {
		if(this.saldo < valor) {
			return false;
		}
		
		this.setSaldo(this.saldo - valor);
		return true;
	}
	
	
	//Método de exibição dos dados
	public void visualizar() {
		//Criando um método para seleção do tipo de conta
		String tipo = " ";
		
		switch(this.tipoConta) {
		case 1: 
			tipo = "Conta corrente";
			break;
		case 2:
			tipo = "Conta poupança";
		}
		
		System.out.println("*************************************************");
		System.out.println("** Dados da conta **");
		System.out.println("*************************************************");
		System.out.println("\nNome do titular: " + this.nomeTitular);
		System.out.println("Agência da conta: " + this.agenciaConta);
		System.out.println("Tipo de conta: " + tipo);
		System.out.println("Número da conta: " + numeroConta);
		System.out.println("Saldo da conta: " + saldo);
		System.out.println("*************************************************");
		
	}
	
}
