package map.ordenacao;

import java.util.*;
import java.util.Map;

public class LivrariaOnline {
	
	private Map<String, Livro> livraria = new HashMap<>();
	
	
	public void adicionarLivro(String link, String titulo, String autor, double preco) {
		Livro livro = new Livro(titulo, autor, preco);
		livraria.put(autor, livro);
	}

	public void removerLivro(String titulo) {
		if(!livraria.isEmpty()) {
			livraria.remove(titulo);
		}
	}
	
	public Map<String, Livro> exibirLivrosOrdenadosPorPreco() {
	    List<Map.Entry<String, Livro>> livrosParaOrdenarPorPreco = new ArrayList<>(livraria.entrySet());

	    Collections.sort(livrosParaOrdenarPorPreco, new ComparatorPorPreco());

	    Map<String, Livro> livrosOrdenadosPorPreco = new LinkedHashMap<>();

	    for (Map.Entry<String, Livro> entry : livrosParaOrdenarPorPreco) {
	      livrosOrdenadosPorPreco.put(entry.getKey(), entry.getValue());
	    }

	    return livrosOrdenadosPorPreco;
	  }
	
	
	 public static void main(String[] args) {
		    LivrariaOnline livrariaOnline = new LivrariaOnline();
		    // Adiciona os livros à livraria online
		    livrariaOnline.adicionarLivro("https://amzn.to/3EclT8Z", "1984", "George Orwell", 50d);
		    livrariaOnline.adicionarLivro("https://amzn.to/47Umiun", "A Revolução dos Bichos", "George Orwell", 7.05d);
		    livrariaOnline.adicionarLivro("https://amzn.to/3L1FFI6", "Caixa de Pássaros - Bird Box: Não Abra os Olhos", "Josh Malerman", 19.99d);
		    livrariaOnline.adicionarLivro("https://amzn.to/3OYb9jk", "Malorie", "Josh Malerman", 5d);
		    livrariaOnline.adicionarLivro("https://amzn.to/45HQE1L", "E Não Sobrou Nenhum", "Agatha Christie", 50d);
		    livrariaOnline.adicionarLivro("https://amzn.to/45u86q4", "Assassinato no Expresso do Oriente", "Agatha Christie", 5d);

		    // Exibe todos os livros ordenados por preço
		    System.out.println("Livros ordenados por preço: \n" + livrariaOnline.exibirLivrosOrdenadosPorPreco());


		  }
}
