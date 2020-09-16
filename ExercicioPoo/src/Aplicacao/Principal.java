package Aplicacao;

import java.util.Scanner;

import Entidades.Cliente;

public class Principal {

	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		Cliente cliente = new Cliente();
		
		System.out.println("Digite o Código do cliente: ");
		cliente.codigoCliente=tec.nextInt();
		
		System.out.println("Digite o CPF do cliente: ");
		cliente.cpfCliente=tec.next();
		
		System.out.println("Digite o Nome do cliente: ");
		cliente.nomeCliente=tec.next();
		
		cliente.mostra();
		
		
		
		
		
		
		
		
		tec.close();

	}

}
