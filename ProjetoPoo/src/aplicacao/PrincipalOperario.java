package aplicacao;

import entidades.Operario;

public class PrincipalOperario {

	public static void main(String[] args) {
		
		Operario operario = new Operario("EDILANE", "RUA FLORESTAL 7", "(11)95485-1267",10000.00,1000.00,2000.00);
		operario.TotalVencimentos(0);
		
		System.out.println(operario.getNome());
		System.out.println(operario.getEndereco());
		System.out.println(operario.getTelefone());
		System.out.println(operario.getValorProducao());
		System.out.println(operario.getComissao());
		System.out.println(operario.getVencimentoBase());
		System.out.println(operario.TotalVencimentos(0));
	}

}
