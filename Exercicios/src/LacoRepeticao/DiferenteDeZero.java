package LacoRepeticao;

import java.util.Scanner;

public class DiferenteDeZero {

	public static void main(String[] args) {
		int numero, soma=0;
		
		Scanner tec = new Scanner(System.in);
	
		
		do {
			System.out.println("\nDigite um numero: ");
		    numero=tec.nextInt();
		    soma=soma+numero;
		   } while(numero !=0);
		
		System.out.printf("Soma: %d",soma);

		
		tec.close();

	}

}
