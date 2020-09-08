import java.util.Scanner;

public class IdadeEmDias {

	public static void main(String[] args)
	{
	
		int anos, meses, dias, totalDias;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println(" Digite sua idade em anos: ");
		anos = teclado.nextInt();
		
		System.out.println(" Digite sua idade em meses: ");
		meses= teclado.nextInt();
		
		System.out.println(" Digite sua idade em dias: ");
		dias = teclado.nextInt();
		
		totalDias = (dias+(anos*365)+(meses*30));
		
		System.out.println("Sua idade em dias é : "+ totalDias);
		
		teclado.close();
	}

}
