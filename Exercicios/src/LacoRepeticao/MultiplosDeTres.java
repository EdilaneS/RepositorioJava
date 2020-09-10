package LacoRepeticao;

import java.util.Scanner;

public class MultiplosDeTres {

	public static void main(String[] args) {
		int numero, soma=0;
		double media=0,contador=0;
		
		Scanner tec = new Scanner(System.in);
	
		
		do{
			System.out.println("\nDigite um numero: ");
		    numero=tec.nextInt();
		    if((numero%3)==0)
		    {
		    	soma=soma+numero;
		    	contador++;
		    }
			
		}while(numero!=0);
		
		media=soma/contador;
		System.out.printf("Media Dos numeros: %.1f", media);
		tec.close();

	}

}
