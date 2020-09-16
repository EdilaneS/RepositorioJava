package Entidades;

public class Cliente {

	public int codigoCliente;
	public String nomeCliente;
	public String cpfCliente;
	
	public void mostra() {
		System.out.printf("\nO código do Cliente é: %d", codigoCliente);
		System.out.printf("\nO CPF do cliente é: %s", cpfCliente);
		System.out.printf("\nO nome do Cliente é: %s", nomeCliente);

	}
}
