package LacoRepeticao;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
		
		Scanner tec = new Scanner(System.in);
		
		int numero,par=0,impar=0;
		
		
		for(numero=1;numero<=10;numero++) {
			System.out.println("Digite um numero: ");
			numero=tec.nextInt();
			if((numero%2)==0) {
				par++;
			}
			else if((numero%2)!=0) {
				impar++;
			}
			
		}
		System.out.printf("Numeros Pares %d \nNumeros �mpares %d",par,impar);
		
		tec.close();
		
		

	}

}
