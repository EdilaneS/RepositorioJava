package Condicional;

import java.util.Scanner;

public class OrdemCrescente {

	public static void main(String[] args) {
		/*
		 * 2-	Faça um programa que entre com três números e coloque em ordem crescente.
		 */
		
		int numero1,numero2,numero3;
		
		Scanner tec = new Scanner(System.in);
		
		System.out.printf("Digite o primeiro numero: ");
		numero1= tec.nextInt();
		
		System.out.printf("Digite o segundo numero: ");
		numero2= tec.nextInt();
		
		System.out.printf("Digite o terceiro numero: ");
		numero3= tec.nextInt();
		
		if(numero1>numero2 && numero1>numero3 && numero2>numero3) 
		{
			System.out.printf("Ordem crescente: %d %d %d ",numero3,numero2,numero1);
		}
		else if(numero1>numero2 && numero1>numero3 && numero3>numero2) 
		{
			System.out.printf("Ordem crescente: %d %d %d",numero2,numero3,numero1);
		}
		else if(numero2>numero1 && numero2>numero3 && numero1>numero3) 
		{
			System.out.printf("Ordem crescente: %d %d %d ",numero3,numero1,numero2);
		}
		else if(numero2>numero1 && numero2>numero3 && numero3>numero1) 
		{
			System.out.printf("Ordem crescente: %d %d %d ",numero1,numero3,numero2);
		}
		else if(numero3>numero1 && numero3>numero2 && numero2>numero1) 
		{
			System.out.printf("Ordem crescente: %d %d %d ",numero1,numero2,numero3);
		}
		else if(numero3>numero1 && numero3>numero2 && numero1>numero2) 
		{
			System.out.printf("Numeros: %d %d %d ",numero2,numero1,numero3);
		}
		
		
		
		
		tec.close();
				

	}

}
