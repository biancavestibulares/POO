package conta.model;

public class Conta {
	
	//Adicionando os atributos da conta
	//Atributos escolhidos foram titular, número da conta, tipo de conta, 
	//saldo e status da conta
	private String nomeTitular;
	private String tipoConta;
	private String statusConta;
	private int numeroConta;
	private float saldo;
	
	//Construtor
	public Conta(String nomeTitular, String tipoConta, String statusConta, int numeroConta, float saldo) {
		this.nomeTitular = nomeTitular;
		this.tipoConta = tipoConta;
		this.statusConta = statusConta;
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
	public String getTipoConta() {
		return tipoConta;
	}
	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}
	public String getStatusConta() {
		return statusConta;
	}
	public void setStatusConta(String statusConta) {
		this.statusConta = statusConta;
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
	
}
