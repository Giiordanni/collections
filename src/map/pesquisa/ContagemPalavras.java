package map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {

	Map<String, Integer> palavras = new HashMap<>();
	
	public void adicionarPalavra(String palavra, Integer contagem) {
		palavras.put(palavra, contagem);
	}
	
	public void removerPalavra(String palavra) {
		if(!palavras.isEmpty()) {
			if(palavras.equals(palavra)) {
				palavras.remove(palavra);
			}else {
				System.out.println("Palavra não encontrada!");
			}
			
		}
	}
	
	public void exibirContagemPalavras() {
	    System.out.println("Existem " + palavras + " palavras.");

	}
	
	public String encontrarPalavraMaisFrequente(){
		String palavrasMaisfrequente = null;
		int contagem = 0;
		if(!palavras.isEmpty()) {
			for(Map.Entry<String, Integer> entry : palavras.entrySet()) {
				 if(entry.getValue() > contagem) {
					 contagem = entry.getValue();
					 palavrasMaisfrequente = entry.getKey();
				 }
			}
		}
		return palavrasMaisfrequente;
	}
	
	
	 public static void main(String[] args) {
		    ContagemPalavras contagemLinguagens = new ContagemPalavras();

		    // Adiciona linguagens e suas contagens
		    contagemLinguagens.adicionarPalavra("Java", 2);
		    contagemLinguagens.adicionarPalavra("Python", 8);
		    contagemLinguagens.adicionarPalavra("JavaScript", 1);
		    contagemLinguagens.adicionarPalavra("C#", 6);

		    // Exibe a contagem total de linguagens
		    contagemLinguagens.exibirContagemPalavras();

		    // Encontra e exibe a linguagem mais frequente
		    String linguagemMaisFrequente = contagemLinguagens.encontrarPalavraMaisFrequente();
		    System.out.println("A linguagem mais frequente é: " + linguagemMaisFrequente);
		  }
	
}
