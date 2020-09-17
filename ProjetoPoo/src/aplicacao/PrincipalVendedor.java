package aplicacao;

import entidades.Vendedor;

public class PrincipalVendedor {

	public static void main(String[] args) {
		Vendedor vendedor = new Vendedor("EDILANE", "RUA FLORESTAL 7", "(11)95485-1267",20000.00,2000.00,3000.00);
		vendedor.TotalVencimentos(0);
		
		System.out.println(vendedor.getNome());
		System.out.println(vendedor.getEndereco());
		System.out.println(vendedor.getTelefone());
		System.out.println(vendedor.getValorVendas());
		System.out.println(vendedor.getComissao());
		System.out.println(vendedor.getVencimentoBase());
		System.out.println(vendedor.TotalVencimentos(0));

	}

}
