package generics.list.operacoes_basicas;

import java.util.ArrayList;
import java.util.List;

public class ListaDeTarefas {

	private List<Tarefa> tarefaList; // = new ArrayList<>()
	
	ListaDeTarefas(){
		this.tarefaList = new ArrayList<>();
	}
	
	
	/*public void adicionarTarefa(String descricao) {
		tarefaList.add(new Tarefa(descricao));
	}
	
	public void removerTarefa(String descricao) {
		List<Tarefa> tarefasParaRemover = new ArrayList<>();
		for(Tarefa t : tarefaList) {
			if(t.getDescricao().equalsIgnoreCase(descricao)) {
				tarefasParaRemover.add(t);
			}
		}
		tarefaList.removeAll(tarefasParaRemover);
	}
	
	public int obterNumeroTotaldeTarefas() {
		return tarefaList.size();
	}
	
	public void ObterDescricoesTarefas() {
		System.out.println(tarefaList);
	}
	*/
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		ListaDeTarefas listTarefa = new ListaDeTarefas();
		//System.out.println("O número total de elementos na lista é: " + listTarefa.obterNumeroTotaldeTarefas());
		
		// Adicionando Tarefas
		/*listTarefa.adicionarTarefa("Estudar");
		listTarefa.adicionarTarefa("Rezar");
		listTarefa.adicionarTarefa("Sair");	
		listTarefa.adicionarTarefa("sair");
		System.out.println("\n----------------Imprimindo Tarefas-------------------");
		listTarefa.ObterDescricoesTarefas();
		System.out.println("O número total de elementos na lista é: " + listTarefa.obterNumeroTotaldeTarefas());
		System.out.println("\n----------------Removendo Tarefas---------------------");
		listTarefa.removerTarefa("sair");
		System.out.println("O número total de elementos na lista é: " + listTarefa.obterNumeroTotaldeTarefas());
		listTarefa.ObterDescricoesTarefas();
		*/
		
		
		
	}
	
}
