package conta.util;

import java.util.Scanner;

public class Cores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Não tenho certeza do que fazer, então criarei uma solução que inventei na cabeça :)
		//Scanner
		Scanner leia = new Scanner(System.in);

		//Variáveis para identificar se o cliente está devendo ou não
		float valorDevendo = 0;
		float valorDepositando = 0;

		System.out.println("Insira o valor que está devendo para o banco: ");
		valorDevendo = leia.nextFloat();
		System.out.println("Digite o valor que está depositando para o banco: ");
		valorDepositando = leia.nextFloat();
	}

	//Colocamos os métodos fora do Main, porque Main já é um método, e métodos não podem estar um dentro dos outros
	//Executando os métodos da calculadora
	public static float vermelho(float numero1, float numero2) {
		return numero1 + numero2; //Soma
	}

}
