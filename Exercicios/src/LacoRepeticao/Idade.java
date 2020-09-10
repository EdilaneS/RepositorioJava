package LacoRepeticao;

import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		/*
		 * Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
		 * Total de pessoas
		 *  com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)
		 */
		
		Scanner tec = new Scanner(System.in);
		
		int idade=0, menores=0, maiores=0;
		final int LIMITE = 99;
		
		while(idade <= LIMITE) {
			System.out.println("Digite sua idade: ");
			idade=tec.nextInt();
			if(idade<21) {
				menores++;
			}
			if(idade>50) {
				maiores++;
			}
		}
		System.out.printf("Total de pessoas menores de 21: %d ",menores);
		System.out.printf("\nTotal de pessoas maiores de 50: %d ",maiores);
		
		
		
		
		
		tec.close();

	}

}
