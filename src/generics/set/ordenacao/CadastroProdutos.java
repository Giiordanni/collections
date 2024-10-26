package generics.set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
	
	Set<Produtos> cadastroProdutos;
	
	public CadastroProdutos() {
		cadastroProdutos = new HashSet<>();
	}
	
	public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
		cadastroProdutos.add(new Produtos(nome, cod, preco, quantidade));
	}
	
	public Set<Produtos> exibirProdutosPorNome() {
		Set<Produtos> produtosPorNome = new TreeSet<>(cadastroProdutos);
		return produtosPorNome;
	}
	
	public Set<Produtos> exibirProdutosPorPreco(){
		Set<Produtos> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
		produtosPorPreco.addAll(cadastroProdutos);
		return cadastroProdutos;
	}
	
	
	public static void main(String[] args) {
		CadastroProdutos produto = new CadastroProdutos();
		System.out.println(produto.cadastroProdutos);
		
		produto.adicionarProduto(12,"Arroz", 7.5, 2);
		produto.adicionarProduto(13,"Macarrao", 4, 2);
		produto.adicionarProduto(14,"Feijao", 10, 2);
		produto.adicionarProduto(11,"Castanha", 2, 2);

		System.out.println(produto.cadastroProdutos);
		System.out.println(produto.exibirProdutosPorPreco());
		System.out.println(produto.exibirProdutosPorNome());
	}

}
