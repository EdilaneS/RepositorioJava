import java.util.Scanner;

public class Program {

	public static void main(String[] args) 
	{
		

		//System.out.println("HELLO WORD");
		//System.out.println("EDILANE SANTOS DOS SANTOS");
		
		String nomeUsuario;
		int idadeUsuario;
		double alturaUsuario;
		
		Scanner tec = new Scanner(System.in); //teclado
		
		
		nomeUsuario="edilane";
		idadeUsuario=25;
		alturaUsuario=1.74;
		
		
		System.out.println("O usu�rio "+nomeUsuario+" tem "+idadeUsuario+" anos e tem "+ alturaUsuario);
		System.out.printf("o usu�rio %s tem %d anos e tem %.2f", nomeUsuario,idadeUsuario,alturaUsuario );
		System.out.print("\n Digite o nome do usu�rio: ");
		nomeUsuario = tec.next();
		
		System.out.printf("O nome do usu�rio agora � %s", nomeUsuario);
		
		
		tec.close();
		
		

	}

}
