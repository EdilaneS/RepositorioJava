import java.util.Scanner;

public class InverterNumeros {
/*
 * DESAFIO JAVA - FAZER UM PROGRAMA QUE LEIA DUAS VARIAVEIS 
 * INTEIRAS SIMPLES E INVERTA OS VALORES DAS VARIAVEIS NO SEU CONTEUDO E EXIBA O RESULTADO,
 *  ASSIM: DIGITE O VALOR DE X:
DIGITE O VALOR DE Y:
NO MOMENTO X VALOR ??? E Y VALE  ???
INVERTENDO VALORES
EXIBA X (QUE DEVER AGORA TER O VALOR DE Y)
EXIBA Y (QUE DEVER AGORA TER O VALOR DE X)
QUAL O DESAFIO: FAZER ISSO COM O MENOR NUMERO DE VARIAVEIS POSSIVE
 */
	
	public static void main(String[] args)
	{
		int x,y,b;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		x=teclado.nextInt();
		
		System.out.print("Digite outro numero: ");
		y=teclado.nextInt();
		
		System.out.printf("No momento x vale %d e y vale %d",x,y);
		
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		
		System.out.println("\n---------------------------------------------------------------");
		System.out.printf("\nX agora vale %d e Y vale %d",x,y);
		
		
		teclado.close();
	}
	
}
