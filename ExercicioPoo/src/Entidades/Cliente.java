package Entidades;

public class Cliente {

	public int codigoCliente;
	public String nomeCliente;
	public String cpfCliente;
	
	public void mostra() {
		System.out.printf("\nO c�digo do Cliente �: %d", codigoCliente);
		System.out.printf("\nO CPF do cliente �: %s", cpfCliente);
		System.out.printf("\nO nome do Cliente �: %s", nomeCliente);

	}
}
