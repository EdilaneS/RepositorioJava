import java.util.Scanner;

public class ValoresDeXeY {

	public static void main(String[] args) 
	{
		
		int a,b,c,d,e,f,x,y;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		a=teclado.nextInt();
		System.out.println("Digite o segundo numero: ");
		b=teclado.nextInt();
		System.out.println("Digite o terceiro numero: ");
		c=teclado.nextInt();
		System.out.println("Digite o quarto numero: ");
		d=teclado.nextInt();
		System.out.println("Digite o quinto numero: ");
		e=teclado.nextInt();
		System.out.println("Digite o sexto numero: ");
		f=teclado.nextInt();
		
		x=(((c*e)-(b*f))/((a*e)-(b*d)));
		y=(((a*f)-(c*d))/((a*e)-(b*d)));
		
		System.out.printf("O valor de x é %d e o de Y é %d", x,y);
		
		
			
		
		teclado.close();

	}

}
