package map.operacoes_basicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
	
	Map<String, Integer> agendacontatos;

	AgendaContatos(){
		agendacontatos = new HashMap<>();
	}
	
	public void adicionarContato(String nome, Integer telefone) {
		agendacontatos.put(nome, telefone);
	}
	
	public void removerContato(String nome) {
		if(!agendacontatos.isEmpty()) {
			agendacontatos.remove(nome);
		}
	}
	
	public void exibirContatos() {
		System.out.println(agendacontatos);
	}
	
	public Integer pesquisarPorNome(String nome) {
		Integer numeroTell = null;
		if(!agendacontatos.isEmpty()) {
			numeroTell = agendacontatos.get(nome);
		}
		return numeroTell;
	}
	
	public static void main(String[] args) {
		AgendaContatos contatos =  new AgendaContatos();
		 contatos.exibirContatos();
		 
		 contatos.adicionarContato("Giordanni", 98173);
		 contatos.adicionarContato("Giordanni", 5614);
		 contatos.adicionarContato("Emily", 98213);
		 contatos.adicionarContato("Emily Pereira", 2840);
		 contatos.adicionarContato("Giordanni", 83981);

		 contatos.exibirContatos();
		 
		 contatos.removerContato("Giordanni");
		 contatos.exibirContatos();
		 System.out.println(contatos.pesquisarPorNome("Emily"));
		 
		 
		
	}
	
	
}
