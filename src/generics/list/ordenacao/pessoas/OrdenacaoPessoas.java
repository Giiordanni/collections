package generics.list.ordenacao.pessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
	
	private List<Pessoa> listaDePessoas;

	public OrdenacaoPessoas() {
		listaDePessoas = new ArrayList<>();
	}
	
	public void adicionarPessoa(String nome, int idade, double altura) {
		listaDePessoas.add(new Pessoa(nome, idade, altura));
	}
	
}


/*public class OrdenacaoPessoas {
	
	private List<Pessoa> listaDePessoas;

	public OrdenacaoPessoas() {
		listaDePessoas = new ArrayList<>();
	}
	
	public void adicionarPessoa(String nome, int idade, double altura) {
		listaDePessoas.add(new Pessoa(nome, idade, altura));
	}
	
	public List<Pessoa> ordenarPorIdade(){
		List<Pessoa> ordenadasIdades = new ArrayList<>(listaDePessoas);
		Collections.sort(ordenadasIdades);
		return ordenadasIdades;
	}
	
	public List<Pessoa> ordenarPorAltura(){
		List<Pessoa> ordenadasPorAltura = new ArrayList<>(listaDePessoas);
		Collections.sort(ordenadasPorAltura, new CompararPorAltura());
		return ordenadasPorAltura;
	}
	

}*/
