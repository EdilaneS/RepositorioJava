package Entidades;

public class Funcionario {

	public int codFuncionario;
	public String nomeFuncionario;
	public String cpfFuncionario;
	public double salario;

	public void mostra() {
		System.out.printf("\nCodigo do funcion�rio: %d", codFuncionario);
		System.out.printf("\nNome do funcion�rio: %s", nomeFuncionario);
		System.out.printf("\nCPF do funcion�rio: %s", cpfFuncionario);
		System.out.printf("\nSal�rio do funcion�rio: %.2f", salario);
		
			
		
		
		
	}
}
