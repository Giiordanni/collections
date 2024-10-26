package generics.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

import javax.management.RuntimeErrorException;

public class CatalagoDeLivros {

	private List<Livro> listaLivro;
	
	public CatalagoDeLivros() {
		listaLivro = new ArrayList<>();
	}
	
	public void adicionarLivro(String titulo, String autor, int anoPublicacao){
		listaLivro.add(new Livro(titulo, autor, anoPublicacao));
	}

	public List<Livro> pesquisarPorAutor(String autor){
		List<Livro> listPorAutor = new ArrayList<>();
		if(!listaLivro.isEmpty()) {
			for(Livro l : listaLivro) {
				if(l.getAutor().equalsIgnoreCase(autor)) {
					listPorAutor.add(l);
				}
			}
		}
		return listPorAutor;
	}
	
	public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
		List<Livro> intervaloAnos = new ArrayList<>();
		if(!listaLivro.isEmpty()) {
			for(Livro l : listaLivro) {
				if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
					intervaloAnos.add(l);
				}
			}
		}
		return intervaloAnos;
	}
	
	public Livro pesquisarPorTitulo(String titulo){
		Livro livroPortitulo = null;
		if(!listaLivro.isEmpty()) {
			for(Livro l : listaLivro) {
				if(l.getTitulo().equalsIgnoreCase(titulo)) {
					livroPortitulo = l;
					return livroPortitulo;
				}
			}
		}
		throw new RuntimeException("Livro não encontrado");
	}
	
	
	
	public static void main(String[] args) {
		CatalagoDeLivros catalago = new CatalagoDeLivros();
		
		catalago.adicionarLivro("Nossa Senhora", "Joan Carroll Cruz", 2012);
		catalago.adicionarLivro("Nossa Senhora", "São Luis", 1876);
		catalago.adicionarLivro("Vida e Glória de São José", "E. H. Thompsom", 2021);
		catalago.adicionarLivro("Vida e Glória de Maria", "E. H. Thompsom", 2021);
		catalago.adicionarLivro("A crise da igreja católica e a TL", "Frei Clodolvis", 2022);
		catalago.adicionarLivro("No coração da igreja", "Felipe Aquino", 2011);
		
		
		System.out.println("Pesquisa por Intervalo de anos: " + catalago.pesquisarPorIntervaloAnos(2010, 2018));
		System.out.println("Pesquisa por autor: " + catalago.pesquisarPorAutor("E. H. Thompsom"));
		
		try {
			System.out.println("Pesquisa por título: " + catalago.pesquisarPorTitulo("Vida e Glória de Maria"));
		}catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	
}
