package aplicacao;

import entidades.Fornecedor;

public class Principal {

	public static void main(String[] args) {

		Fornecedor fornecedor = new Fornecedor("EDILANE", "RUA FLORESTAL 7", "(11)95485-1267", 3000, 1000);
		fornecedor.ValorSaldo(0);
		
		System.out.println(fornecedor.getNome());
		System.out.println(fornecedor.getEndereco());
		System.out.println(fornecedor.getTelefone());
		System.out.println(fornecedor.getValorCredito());
		System.out.println(fornecedor.getValorDivida());
		System.out.println(fornecedor.ValorSaldo(0));



	}

}
