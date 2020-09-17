package aplicacao;
import entidades.Aluno;
import entidades.Disciplina;
import entidades.Pessoa;
import entidades.Professor;
public class Cadastro {
	public static void main(String[] args)
	{
		System.out.println("SISTEMA DE CADASTRO: ");
		
		Pessoa fulano = new Pessoa("JOAO");
		Pessoa ciclano = new Pessoa("MARIA",'F',1990);
		
		Aluno novoAluno = new Aluno("Carlos",'M',2020,"BRANCO","TURMA8");
		Professor novoProfessor = new Professor("LUIZA", "MODULO II");
		
		System.out.println(novoProfessor.getNome());
		
		System.out.println(novoAluno.getTurma());
		
	
	}
}