package generics.set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

	Set<Tarefa> tarefaSet = new HashSet<>();
	
	public void adicionarTarefa(String descricao) {
		tarefaSet.add(new Tarefa(descricao));
	}
	
	public void removerTarefa(String descricao) {
		Tarefa removerT = null;
		if(!tarefaSet.isEmpty()) {
			for(Tarefa t : tarefaSet) {
				if(t.getDescriao().equalsIgnoreCase(descricao)) {
					removerT = t;
					break;
				}
			}
			tarefaSet.remove(removerT);
		}else {
			throw new RuntimeException("Liista de tarefas vazia!");
		}
		if(removerT == null) {
			System.out.println("Tarefa não encontrada!");
		}
	}
	
	public void exibirTarefas() {
		System.out.println(tarefaSet);
	}
	
	public int contarTarefas() {
		return tarefaSet.size();
	}
	
	public Set<Tarefa> obterTarefasConcluidas(){
		if(!tarefaSet.isEmpty()) {
			Set<Tarefa> tarefaConcluidas = new HashSet<>();
			for(Tarefa t : tarefaSet) {
				if(t.isConcluida()) {
					tarefaConcluidas.add(t);
				}
			}
			return tarefaConcluidas;
		}else {
			throw new RuntimeException("Liista de tarefas vazia!");
		}
	}
	
	public Set<Tarefa> obterTarefasPendentes(){
		if(!tarefaSet.isEmpty()) {
			Set<Tarefa> tarefsPendente = new HashSet<>();
			for(Tarefa t : tarefaSet) {
				if(!t.isConcluida()) {
					tarefsPendente.add(t);
				}
			}
			return tarefsPendente;
		}else {
			throw new RuntimeException("Liista de tarefas vazia!");
		}
	}
	
	public void marcarTarefaConcluida(String descricao) {
		if(!tarefaSet.isEmpty()) {
			for(Tarefa t : tarefaSet) {
				if(t.getDescriao().equalsIgnoreCase(descricao) && !t.isConcluida()) {
					t.setConcluida(true);
					break;
				}else if(t.getDescriao().equalsIgnoreCase(descricao) && t.isConcluida()){
					System.out.println("A tarefa já foi concluída!");
				}
			}
		}else {
			throw new RuntimeException("Liista de tarefas vazia!");
		}
		
	}
	
	public void marcarTarefaPendente(String descricao) {
		Tarefa marcarPendente = null;
		if(!tarefaSet.isEmpty()) {
			for(Tarefa t : tarefaSet) {
				if(t.getDescriao().equalsIgnoreCase(descricao)) {
					marcarPendente = t;
					break;
				}
			}
		}else{
			throw new RuntimeException("Liista de tarefas vazia!");
		}
		
		if(marcarPendente != null) {
			if(marcarPendente.isConcluida()) {
				marcarPendente.setConcluida(false);
			}
		}else {
			System.out.println("Tarefa não encontrada!");
		}
	}
	
	public void limparListaTarefas() {
		if(!tarefaSet.isEmpty()) {
			tarefaSet.clear();
		}else {
			throw new RuntimeException("Liista de tarefas vazia!");
		}
	}
	
}
