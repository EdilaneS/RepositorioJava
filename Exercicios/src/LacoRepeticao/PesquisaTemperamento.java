package LacoRepeticao;

import java.util.Scanner;
public class PesquisaTemperamento {
	public static void main(String[] args) {
		
		
		
		Scanner tec = new Scanner(System.in);
		int idade, sexo, temperamento;
		int pessoas = 0, mulherNervosa = 0, calma = 0, homemAgressivo = 0, pessoaCalma = 0, pessoaNervosa = 0;
		final int LIMITE = 6;
		
		
		while (pessoas < LIMITE) {
			System.out.println("Digite sua Idade: ");
			idade = tec.nextInt();
			System.out.println("Sexo: \n1- Masculino\n2-Feminino: ");
			sexo = tec.nextInt();
			
			System.out.println("Temperamento: \n 1 - Calmo[a] \n 2 - Nervoso[a] \n 3 - Agressivo[a]");
			temperamento = tec.nextInt();
			if(temperamento == 1) {
				calma++;
				if (idade<18) {
					pessoaCalma++;
				}
			}
			else if(sexo ==1 && temperamento == 3) {
				homemAgressivo++;
				
			}
			else if (idade > 40 && temperamento ==2) {
				pessoaNervosa++;
				if (sexo==2) {
					mulherNervosa++;
				}
			}
			pessoas++;
			
		}
		System.out.printf("\nTotal de pessoas pesquisadas: %d", pessoas);
		System.out.printf("\nNumero de pessoas calma: %d", calma);
		System.out.printf("\nMulheres nervosas: %d", mulherNervosa);
		System.out.printf("\nNumeros de homens agressivos: %d",  homemAgressivo);
		System.out.printf("\nNumero de pessoas nervorsas com mais de 40 anos: %d", pessoaNervosa);
		System.out.printf("\nNumero de pessoas calmas menores de 18 anos: %d", pessoaCalma);
		
		tec.close();
	}
}