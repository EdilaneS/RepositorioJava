package aplicacao;

import entidades.Empregado;

public class PrincipalEmpregado {

	public static void main(String[] args) {
		Empregado empregado = new Empregado("EDILANE", "RUA FLORESTAL 7", "(11)95485-1267",10,1000,0.075);
		empregado.calcularSalario(0);
		
		System.out.println(empregado.getNome());
		System.out.println(empregado.getEndereco());
		System.out.println(empregado.getTelefone());
		System.out.println(empregado.getCodigoSetor());
		System.out.println(empregado.getSalarioBase());
		System.out.println(empregado.getImposto());
		System.out.println(empregado.calcularSalario(0));

	}

}
