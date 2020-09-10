import java.util.Scanner;

public class DuracaoEvento {

	public static void main(String[] args) {
		
		
		int segundos,horas,minutos,seg;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a duração do evento em segundos: ");
	    segundos = teclado.nextInt();
	   
	    horas=(segundos / 3600);
	    minutos=((segundos % 3600) / 60);
	    seg =((segundos % 3600) % 60);
	   System.out.printf("A duração do evento foi de %d horas %d minutos %d segundos",horas,minutos,seg);
	  
	   teclado.close();
	   
	  

	}

}
