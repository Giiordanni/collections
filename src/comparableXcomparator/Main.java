package comparableXcomparator;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		ArrayList<Livro> livros = new ArrayList<Livro>() {
			{
				add(new Livro("Nossa Senhora", "Joan Carroll Cruz", 2012));
				add(new Livro("Vida e Glória de São José", "E. H. Thompsom", 2021));
				add(new Livro("A crise da igreja católica e a TL", "Frei Clodolvis", 2022));
				add(new Livro("No coração da igreja", "Felipe Aquino", 2011));
				add(new Livro("Docummento de Aparecidda", "Bispos da America Latina", 2007));
			}
		};
		
		
		System.out.println("Livros após a ordenação natural (Título):");
		Collections.sort(livros, Collections.reverseOrder());
		for(Livro livro: livros) {
			System.out.println(livro.getTitulo() + " - " + livro.getAutor() + " - " + livro.getAno());
		}
		
		System.out.println("--------------------------------------------------------");
		System.out.println("\nLivros após a aordenação por ano: ");
		Collections.sort(livros, new CompararAno());
		for(Livro livroAno : livros) {
			System.out.println(livroAno.getAno() + " - " + livroAno.getTitulo() + " - " +  livroAno.getAutor());
		}
		
		
		System.out.println("--------------------------------------------------------");
		System.out.println("\nLivros após a aordenação por autor");
		Collections.sort(livros, new CompararAutor());
		for(Livro livroAutor : livros) {
			System.out.println(livroAutor.getAutor() + " - " + livroAutor.getTitulo() + " - " + livroAutor.getAno());
		}
		
		
		System.out.println("--------------------------------------------------------");
		
		System.out.println("\nLivros após a aordenação por Ano, Autor e Título");
		Collections.sort(livros, new CompararAnoAutorTitulo());
		for(Livro livro : livros) {
			System.out.println(livro.getAno() + " - " + livro.getAutor() + " - " + livro.getTitulo() );
		}
		
		
		
	}

}
