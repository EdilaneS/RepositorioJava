package Condicional;

import java.util.Scanner;

public class MaiorValor {

	public static void main(String[] args) 
	{
		/*
		 * Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
		 */
		
		int numero1,numero2,numero3;
		
		Scanner tec = new Scanner(System.in);
		
		System.out.printf("Digite o primeiro numero: ");
		numero1= tec.nextInt();
		
		System.out.printf("Digite o segundo numero: ");
		numero2= tec.nextInt();
		
		System.out.printf("Digite o terceiro numero: ");
		numero3= tec.nextInt();
		
		if(numero1>numero2 && numero1>numero3)
		{	
			System.out.printf("O Numero %d � o maior: ",numero1);
		}
		else if(numero2>numero1 && numero2>numero3)
		{
			System.out.printf("O Numero %d � o maior: ",numero2);
		}
		else
		{
			System.out.printf("O Numero %d � o maior!! ",numero3);
		}
		tec.close();

	}

}
