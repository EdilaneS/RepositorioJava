package Entidades;

public class Conta {
	
	public int numeroConta;
	public int agenciaConta;
	public String titularConta;
	public double saldo;
	
	
	public void mostra() {
		System.out.printf("\nAgência: %d ",agenciaConta);
		System.out.printf("\nConta: %d ",numeroConta);
		System.out.printf("\nTitular: %s ",titularConta);
		System.out.printf("\nSaldo: %.2f ",saldo);
		
		
	}
	

}
