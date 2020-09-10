package Condicional;

import java.util.Locale;
import java.util.Scanner;

public class ParImparRaiz {

	public static void main(String[] args) {
/*
 * Faça um programa em que permita a entrada de um número qualquer e exiba
 *  se este número é par ou ímpar. Se for par exiba também a raiz quadrada 
 *  do mesmo; se for ímpar exiba o número elevado ao quadrado.
 */
		Locale.setDefault(Locale.US); 

		double numero,raiz,nQuadrado;
		
		Scanner tec = new Scanner(System.in);
		
		System.out.printf("Digite um numero");
		numero=tec.nextDouble();
		
		if(numero % 2 == 0) 
		{
			raiz = Math.sqrt(numero);
			System.out.printf("O numero digitado  %.1f é par e sua raiz quadrada é %.1f",numero,raiz);
		}
		else
		{
			nQuadrado = Math.pow(numero, 2);
			System.out.printf("O numero digitado  %.1f é impar e seu quadrada é %.1f",numero,nQuadrado);

			
		}
		
		
		tec.close();
			
			
		
		
	}

}
