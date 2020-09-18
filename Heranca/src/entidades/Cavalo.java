package entidades;

public class Cavalo extends Animal {

	public Cavalo(String nome, int idade) {
		super(nome, idade);
		
	}
	public void Correr() {
		System.out.println("Correndo...");
	}
	
	public void emitirSom(){
		System.out.println("ihinnn...");
	}

	
}
