import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args)
	{
		double primeiraNota, segundaNota, terceiraNota, media;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		primeiraNota=teclado.nextDouble();
		primeiraNota=(primeiraNota*2)/10;
		
		System.out.println("Digite a segunda nota: ");
		segundaNota=teclado.nextDouble();
		segundaNota=(segundaNota*3)/10;
		
		System.out.println("Digite a terceira nota: ");
		terceiraNota=teclado.nextDouble();
		terceiraNota=(terceiraNota*5)/10;
		
		media = primeiraNota+segundaNota+terceiraNota;
		System.out.println("Sua média é: "+ media);
		
		teclado.close();

	}

}
