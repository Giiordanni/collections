package map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
	
	private Map<Long, Produto> produtosestoque;
	
	EstoqueProdutos() {
		produtosestoque = new HashMap<>();
	}
	
	public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
		produtosestoque.put(cod, new Produto(nome, preco, quantidade));
	}
	
	public void exibirProdutos() {
		if(!produtosestoque.isEmpty()) {
			System.out.println(produtosestoque);
		}
	}
	
	public Double calcularValorTotalEstoque() {
		double valortotalestoque = 0d;
		if(!produtosestoque.isEmpty()) {
			for(Produto p : produtosestoque.values()) {
				valortotalestoque += p.getPreco() * p.getQuantidade();
			}
		}
		return valortotalestoque;
	}
	
	public Produto obterProdutoMaisCaro() {
		Produto proMaisCaro = null;
		double maisCaro = Double.MIN_VALUE;
		if(!produtosestoque.isEmpty()) {
			for(Produto p : produtosestoque.values()) {
				if(maisCaro < p.getPreco()) {
					proMaisCaro = p;
					maisCaro = p.getPreco();
				}
			}
		}
		return proMaisCaro;
	}
	
	public Produto obterProdutoMaisBarato() {
		Produto produtoMaisBarato = null;
		Double maisBaratos = Double.MAX_VALUE;
		if(!produtosestoque.isEmpty()) {
			for(Produto p : produtosestoque.values()) {
				if(maisBaratos > p.getPreco()) {
					produtoMaisBarato = p;
					maisBaratos = p.getPreco();
				}
			}
		}
		return produtoMaisBarato;
	}
	
	public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
		Produto produtoMaiorQuantidadeValorNoEstoque = null;
		double maiorValorEstoque = 0d;
		if(!produtosestoque.isEmpty()) {
			for(Map.Entry<Long, Produto> p : produtosestoque.entrySet()) {
				 double valorProdutoEmEstoque = p.getValue().getPreco() * p.getValue().getQuantidade();
				 if(valorProdutoEmEstoque > maiorValorEstoque) {
					 maiorValorEstoque = valorProdutoEmEstoque;
					 produtoMaiorQuantidadeValorNoEstoque = p.getValue();
				 }
			}
		}
		
		return produtoMaiorQuantidadeValorNoEstoque;
	}
	
	public static void main(String[] args) {
	    EstoqueProdutos estoque = new EstoqueProdutos();

	    // Exibe o estoque vazio
	    estoque.exibirProdutos();

	    // Adiciona produtos ao estoque
	    estoque.adicionarProduto(1L, "Notebook", 1, 1500.0);
	    estoque.adicionarProduto(2L, "Mouse", 5, 25.0);
	    estoque.adicionarProduto(3L, "Monitor", 10, 400.0);
	    estoque.adicionarProduto(4L, "Teclado", 2, 40.0);

	    // Exibe os produtos no estoque
	    estoque.exibirProdutos();

	    // Calcula e exibe o valor total do estoque
	    System.out.println("Valor total do estoque: R$" + estoque.calcularValorTotalEstoque());

	    // Obtém e exibe o produto mais caro
	    Produto produtoMaisCaro = estoque.obterProdutoMaisCaro();
	    System.out.println("Produto mais caro: " + produtoMaisCaro);

	    // Obtém e exibe o produto mais barato
	    Produto produtoMaisBarato = estoque.obterProdutoMaisBarato();
	    System.out.println("Produto mais barato: " + produtoMaisBarato);

	    // Obtém e exibe o produto com a maior quantidade em valor no estoque
	    Produto produtoMaiorQuantidadeValorTotal = estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque();
	    System.out.println("Produto com maior quantidade em valor no estoque: " + produtoMaiorQuantidadeValorTotal);
	  }

}
