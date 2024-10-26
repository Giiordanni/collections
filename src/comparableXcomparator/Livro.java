package comparableXcomparator;

import java.util.Comparator;

//Uma classe 'Livro' que implementa Comparable
class Livro implements Comparable<Livro>{
	
	private String titulo;
	private String autor;
	private int ano;
	
	// Construtor
	Livro(String titulo, String autor, int ano){
		this.titulo = titulo;
		this.autor = autor;
		this.ano = ano;
	}
	
	
	// Orddenar os livros por titulo
	public int compareTo(Livro li) {
		return titulo.compareTo(li.titulo);
	}
	
	// Métodos getters para acessar os dados privados
	public String getTitulo() {
		return titulo;
	}



	public int getAno() {
		return ano;
	}



	public String getAutor() {
		return autor;
	}

	
}

	//Classe para comparar Livro por autor
	class CompararAutor implements Comparator<Livro> {
	
	  @Override
	  public int compare(Livro l1, Livro l2) {
			return l1.getAutor().compareTo(l2.getAutor());
		}
	}

	// Classe para comparar Livro por ano
	class CompararAno implements Comparator<Livro> {
	  @Override
	  public int compare(Livro l1, Livro l2) {
			if (l1.getAno() < l2.getAno())
				return -1;
			if (l1.getAno() > l2.getAno())
				return 1;
			else
				return 0;
		}
	}


	class CompararAnoAutorTitulo implements Comparator<Livro> {
		@Override
		public int compare(Livro l1, Livro l2) {
			int ano = Integer.compare(l1.getAno(), l2.getAno());
			if (ano != 0)
				return ano;
			int autor = l1.getAutor().compareTo(l2.getAutor());
			if (autor != 0)
				return autor;
			return l1.getTitulo().compareTo(l2.getTitulo());
		}
	}