package entidades;

public class Disciplina {

	private String nomeDiscplina;
	private int nivel;
	
	public Disciplina(String nomeDiscplina) {
		
		this.nomeDiscplina = nomeDiscplina;
	}
	public Disciplina(String nomeDiscplina, int nivel) {
		
		this.nomeDiscplina = nomeDiscplina;
		this.nivel = nivel;
	}
	public String getNomeDiscplina() {
		return nomeDiscplina;
	}
	public void setNomeDiscplina(String nomeDiscplina) {
		this.nomeDiscplina = nomeDiscplina;
	}
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	
	
	
	
	
}
