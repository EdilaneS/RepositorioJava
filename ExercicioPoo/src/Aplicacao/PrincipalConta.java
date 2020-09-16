package Aplicacao;

import java.util.Scanner;

import Entidades.Conta;

public class PrincipalConta {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner (System.in);
		Conta conta = new Conta();
		
		System.out.println("Digite o numero da sua agencia");
		conta.agenciaConta = tec.nextInt();
		
		System.out.println("Digite o numero da sua conta");
		conta.numeroConta = tec.nextInt();
		
		System.out.println("Titular da conta");
		conta.titularConta = tec.next();
		
		
		conta.saldo=2000;
		
		conta.mostra();
		
		
		
		
		
		tec.close();


	}

}
