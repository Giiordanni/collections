package generics.set.ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Produtos implements Comparable<Produtos>{
	
	private String nome;
	private Long codigoProduto;
	private double preco;
	private int quantidade;
	
	public Produtos(String nome, Long codigoProduto, double preco, int quantidade) {
		this.nome = nome;
		this.codigoProduto = codigoProduto;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	
	
	public String getNome() {
		return nome;
	}



	public Long getCodigoProduto() {
		return codigoProduto;
	}



	public double getPreco() {
		return preco;
	}



	public int getQuantidade() {
		return quantidade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigoProduto);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produtos other = (Produtos) obj;
		return Objects.equals(codigoProduto, other.codigoProduto);
	}

	@Override
	public String toString() {
		return "{" + nome + ", " +  codigoProduto + ", " + preco + " R$, "
				+ quantidade + "}";
	}



	@Override
	public int compareTo(Produtos p) {
		return nome.compareToIgnoreCase(p.getNome());
	}
}

	class ComparatorPorPreco implements Comparator<Produtos>{

		@Override
		public int compare(Produtos p1, Produtos p2) {
			return Double.compare(p1.getPreco(), p2.getPreco());
		}
		
	}
