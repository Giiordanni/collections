package generics.set.operacoes_basicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
	
	private Set<Convidado> convidadoSet;

	public ConjuntoConvidados() {
		convidadoSet = new HashSet<>();
	}
	
	/*public void adicionarConvidado(String nome, int codigoConvite) {
		convidadoSet.add(new Convidado(nome, codigoConvite));
	}
	
	public void removerConvidadoPorCodigoConvite(int codigoConvite) {
		Convidado removerConvidado = null;
		for(Convidado c : convidadoSet) {
			if(c.getCodConvite() == codigoConvite) {
				removerConvidado = c;
				break;
			}
		}
		convidadoSet.remove(removerConvidado);
	}
	
	public int contarConvidados() {
		return convidadoSet.size();
	}
	
	public void exibirConvidados() {
		System.out.println(convidadoSet);
	}*/
	
	
	public static void main(String[] args) {
		ConjuntoConvidados convidados = new ConjuntoConvidados();
		
		/*System.out.println("Lista de convidados: " + convidados.contarConvidados() + " pessoas convidados\n");
		System.out.println("===========Adicionando convidados===============\n");
		convidados.adicionarConvidado("Giordanni", 1);
		convidados.adicionarConvidado("Emily", 2);
		convidados.adicionarConvidado("Taynara", 4);
		convidados.adicionarConvidado("Nadja", 3);
		convidados.adicionarConvidado("Mariana", 8);
		convidados.adicionarConvidado("Ingrinha", 2);
		
		System.out.println("Lista de convidados: " + convidados.contarConvidados() + " convidados");
		convidados.exibirConvidados();
		System.out.println("\nRemovendo convidado 3!");
		convidados.removerConvidadoPorCodigoConvite(3);
		System.out.println("Lista de convidados: " + convidados.contarConvidados() + " convidados");
		convidados.exibirConvidados();
		*/
		
	}

}
