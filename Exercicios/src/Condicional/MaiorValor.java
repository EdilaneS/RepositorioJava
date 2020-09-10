package Condicional;

import java.util.Scanner;

public class MaiorValor {

	public static void main(String[] args) 
	{
		/*
		 * Faça um programa que receba três inteiros e diga qual deles é o maior.
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
			System.out.printf("O Numero %d é o maior: ",numero1);
		}
		else if(numero2>numero1 && numero2>numero3)
		{
			System.out.printf("O Numero %d é o maior: ",numero2);
		}
		else
		{
			System.out.printf("O Numero %d é o maior!! ",numero3);
		}
		tec.close();

	}

}
