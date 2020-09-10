import java.util.Scanner;

public class IdadeEmAnos {

	public static void main(String[] args) {
	
		/*
		 * 2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
		expressa em anos, meses e dias.
		 */
		

		int anos, dias, totalDias,meses;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println(" Digite sua idade em dias: ");
		totalDias = teclado.nextInt();
		
		anos = totalDias/365;
		meses = (totalDias % 365)/30;
		dias = ((totalDias % 365) % 30) % 7;
		
		System.out.printf("Você tem %d anos %d meses %d dias!!!",anos,meses,dias);
		
		teclado.close();

	}

}
