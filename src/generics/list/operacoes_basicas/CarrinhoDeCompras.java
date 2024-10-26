package generics.list.operacoes_basicas;

import java.util.ArrayList;
import java.util.List;

import javax.management.RuntimeErrorException;

public class CarrinhoDeCompras {
	
	private List<Item> carrinhocompras;
	
	
	
	CarrinhoDeCompras(){
		carrinhocompras = new ArrayList<>();
	}
	
	
	public void adicionarItem(String nome, double preco, int quantidade) {
		carrinhocompras.add(new Item(nome, preco, quantidade));
	}
	
	public void removerItem(String nome) {
		List<Item> removerElementos = new ArrayList<>();
		
		if(!carrinhocompras.isEmpty()) {
			for(Item i : carrinhocompras) {
				if(i.getNome().equalsIgnoreCase(nome)) {
					removerElementos.add(i);
				}
			}
			carrinhocompras.removeAll(removerElementos);
		}else {
			System.out.println("O carrinho está vazio!");
		}
	}
	
	public double calcularValorTotal() {
		double valorTotal = 0;
		if(!carrinhocompras.isEmpty()) {
			for(Item i : carrinhocompras) {
				double valorItem = i.getPreco() * i.getQuantidade();
				valorTotal += valorItem;
			}
			return valorTotal;
		}else {
			throw new RuntimeException("O carrinho está vazio!") ;
		}
	}
	
	public void exibirItens() {
		if(!carrinhocompras.isEmpty()) {
			System.out.println(this.carrinhocompras);
		}else {
			System.out.println("O carrinho está vazio!");
		}
		
		
	}
	
	
	public static void main(String[] args) {
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		
		carrinho.adicionarItem("Robo", 75, 1);
		carrinho.adicionarItem("carro", 25, 1);
		carrinho.adicionarItem("lapis", 2d, 1);
		carrinho.adicionarItem("LAPIS", 2d, 1);
		carrinho.exibirItens();
		System.out.print("O valor total do carrinho é: "  + carrinho.calcularValorTotal() + "\n");
		System.out.println("\n==========Removendo o lápis===============");
		carrinho.removerItem("lapis");
		carrinho.exibirItens();
		
		System.out.print("O valor total do carrinho é: "  + carrinho.calcularValorTotal());
		

	}
	
	
}
