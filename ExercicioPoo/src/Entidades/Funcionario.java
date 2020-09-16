package Entidades;

public class Funcionario {

	public int codFuncionario;
	public String nomeFuncionario;
	public String cpfFuncionario;
	public double salario;

	public void mostra() {
		System.out.printf("\nCodigo do funcionário: %d", codFuncionario);
		System.out.printf("\nNome do funcionário: %s", nomeFuncionario);
		System.out.printf("\nCPF do funcionário: %s", cpfFuncionario);
		System.out.printf("\nSalário do funcionário: %.2f", salario);
		
			
		
		
		
	}
}
