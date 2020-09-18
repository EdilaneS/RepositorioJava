package Aplicacao;

import entidades.Animal;
import entidades.Cachorro;
import entidades.Cavalo;
import entidades.Preguica;

public class PrincipalAnimal {

	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro("Scooby", 2);

		System.out.println("Som do Cachorro: ");
		cachorro.emitirSom();

		System.out.println("");
		Cavalo cavalo = new Cavalo("Spirit", 4);

		System.out.println("Som do cavalo...");
		cavalo.emitirSom();
		
		System.out.println("");
		Preguica preguica = new Preguica("Lala", 4);

		System.out.println("Som da Preguiça...");
		preguica.emitirSom();
		

	}

}
