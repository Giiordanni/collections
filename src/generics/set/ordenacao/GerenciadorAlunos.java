package generics.set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

	Set<Aluno> setAluno;
	
	GerenciadorAlunos(){
		setAluno = new HashSet<>();
	}
	
	public void adicionarAluno(String nome, Long matricula, double media) {
		setAluno.add(new Aluno(nome, matricula, media));
	}
	
	public void removerAluno(long matricula) throws Exception{
		Aluno remover = null;
		if(!setAluno.isEmpty()) {
			for(Aluno al : setAluno) {
				if(al.getMatricula() == matricula) {
					remover = al;
					break;
				}
			}
			setAluno.remove(remover);
		}else {
			throw new Exception("Sem alunos na lista!");
		}
		
		if(remover == null) {
			System.out.println("Matrícula não encontrada!");
		}
	}
	
	public Set<Aluno> exibirAlunosPorNome() {
		Set<Aluno> exibirpornome = new TreeSet<>(setAluno);
		return exibirpornome;
	}
	
	public Set<Aluno> exibirAlunosPorNota() throws Exception{
		if(!setAluno.isEmpty()) {
			Set<Aluno> exibirpornota = new TreeSet<>(new ComparatorPorNota());
			exibirpornota.addAll(setAluno);
			return exibirpornota;
		}
		throw new Exception("Sem alunos na lista!");
		
	}
	
	public static void main(String[] args) {
		try {
			// Criando uma instância do GerenciadorAlunos
		    GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

		    // Adicionando alunos ao gerenciador
		    gerenciadorAlunos.adicionarAluno("João", 123456L, 7.5);
		    gerenciadorAlunos.adicionarAluno("Maria", 123457L, 9.0);
		    gerenciadorAlunos.adicionarAluno("Carlos", 123458L, 5.0);
		    gerenciadorAlunos.adicionarAluno("Ana", 123459L, 6.8);

		    // Exibindo todos os alunos no gerenciador
		    System.out.println("Alunos no gerenciador:");
		    System.out.println(gerenciadorAlunos.setAluno);

		    // Removendo um aluno com matrícula inválida e outro pelo número de matrícula
		    gerenciadorAlunos.removerAluno(000L);
		    gerenciadorAlunos.removerAluno(123457L);
		    System.out.println(gerenciadorAlunos.setAluno);

		    // Exibindo alunos ordenados por nome
		    System.out.println(gerenciadorAlunos.exibirAlunosPorNome());
		    
		    // Exibindo alunos ordenados por nota
		    System.out.println(gerenciadorAlunos.exibirAlunosPorNota());

		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}
