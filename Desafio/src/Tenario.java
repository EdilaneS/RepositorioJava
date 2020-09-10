import java.util.Scanner;

public class Tenario {

	public static void main(String[] args) {
		int numero;
		
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Digite 1 para Masculino, 2 Para Feminino, 3 Para Outro");
		numero=tec.nextInt();
		
		System.out.print((numero==1)?"Masculino":(numero==2)?"Feminino":(numero==3)?"Outro":"Opção inválida");
	
		tec.close();
	}

}
