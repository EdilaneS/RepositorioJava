package entidades;

public class Cachorro extends Animal {
	
	public Cachorro(String nome, int idade) {
		super(nome, idade);
		
	}

	public void Correr() {
		System.out.println("Correndo...");
	}
	
	public void emitirSom() {
		System.out.println("Au Au Au AU...");
	}

}
