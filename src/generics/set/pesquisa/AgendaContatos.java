package generics.set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
	
	private Set<Contato> contatoSet;

	public AgendaContatos() {
		contatoSet = new HashSet<>();
	}
	
	public void adicionarContato(String nome, int numero) {
		contatoSet.add(new Contato(nome, numero));
	}
	
	public void exibirContatos() {
		System.out.println(contatoSet);
	}
	
	/*public Set<Contato> pesquisarPorNome(String nome){
		Set<Contato> contatosPorNome = new HashSet<>();
		if(!contatoSet.isEmpty()) {
			for(Contato c : contatoSet) {
				if(c.getNome().startsWith(nome)) {
					contatosPorNome.add(c);
				}
			}
		}
		return contatosPorNome;
	}
	
	public Contato atualizarNumeroContato(String nome, int novoNumero) {
		Contato contatoAtualizado = null;
		if(!contatoSet.isEmpty()) {
			for(Contato c : contatoSet) {
				if(c.getNome().equalsIgnoreCase(nome)) {
					c.setNumero(novoNumero);
					contatoAtualizado = c;
					break;
				}
			}
		}
		return contatoAtualizado;
	}
	*/
	public static void main(String[] args) {
		AgendaContatos contatos = new AgendaContatos();
		
		/*contatos.adicionarContato("Giordanni", 8173);
		contatos.adicionarContato("Giordanni Alves", 5614);
		contatos.adicionarContato("Giordanni Formiga", 55839);
		contatos.adicionarContato("Emily", 8213);
		contatos.adicionarContato("Giordanni A", 1234);
		
		System.out.print("Listar todos os contatos: ");
		contatos.exibirContatos();
		System.out.println("Listar contatos Giordanni: "+contatos.pesquisarPorNome("Giordanni"));
		System.out.println("Atualizando contato! "+contatos.atualizarNumeroContato("Giordanni", 21134));
		*/
	}
	

}
