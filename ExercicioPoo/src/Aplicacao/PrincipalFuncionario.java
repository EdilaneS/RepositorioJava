package Aplicacao;

import java.util.Scanner;

import Entidades.Funcionario;

public class PrincipalFuncionario {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner (System.in);
		Funcionario funcionario = new Funcionario();
		
		System.out.println("Digite o Codigo do funcion�rio: ");
		funcionario.codFuncionario=tec.nextInt();
		
		System.out.println("Digite o nome do funcion�rio: ");
		funcionario.nomeFuncionario=tec.next();
		
		System.out.println("Digite o CPF do funcion�rio: ");
		funcionario.cpfFuncionario=tec.next();
		
		System.out.println("Digite o Sal�rio do funcion�rio: ");
		funcionario.salario=tec.nextDouble();
		
		funcionario.mostra();

		
		
		tec.close();

	}

}
