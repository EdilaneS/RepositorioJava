package Condicional;

import java.util.Locale;
import java.util.Scanner;

public class ParImparRaiz {

	public static void main(String[] args) {
/*
 * Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba
 *  se este n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada 
 *  do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.
 */
		Locale.setDefault(Locale.US); 

		double numero,raiz,nQuadrado;
		
		Scanner tec = new Scanner(System.in);
		
		System.out.printf("Digite um numero");
		numero=tec.nextDouble();
		
		if(numero % 2 == 0) 
		{
			raiz = Math.sqrt(numero);
			System.out.printf("O numero digitado  %.1f � par e sua raiz quadrada � %.1f",numero,raiz);
		}
		else
		{
			nQuadrado = Math.pow(numero, 2);
			System.out.printf("O numero digitado  %.1f � impar e seu quadrada � %.1f",numero,nQuadrado);

			
		}
		
		
		tec.close();
			
			
		
		
	}

}
