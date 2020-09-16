package Aplicacao;

import java.util.Scanner;

import Entidades.Funcionario;

public class PrincipalFuncionario {

	public static void main(String[] args) {
		
		Scanner tec = new Scanner (System.in);
		Funcionario funcionario = new Funcionario();
		
		System.out.println("Digite o Codigo do funcionário: ");
		funcionario.codFuncionario=tec.nextInt();
		
		System.out.println("Digite o nome do funcionário: ");
		funcionario.nomeFuncionario=tec.next();
		
		System.out.println("Digite o CPF do funcionário: ");
		funcionario.cpfFuncionario=tec.next();
		
		System.out.println("Digite o Salário do funcionário: ");
		funcionario.salario=tec.nextDouble();
		
		funcionario.mostra();

		
		
		tec.close();

	}

}
