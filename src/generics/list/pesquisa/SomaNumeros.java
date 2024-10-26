package generics.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
	
	private List<Numeros> listNumeros;

	public SomaNumeros() {
		listNumeros = new ArrayList<>();
	}
	
	public void adicionarNumero(int numero) {
		listNumeros.add(new Numeros(numero));
	}
	
	public int calcularSoma() {
		int total = 0;
		if(!listNumeros.isEmpty()) {
			for(Numeros n : listNumeros) {
				total += n.getNumeros();
			}
			return total;
		}
		throw new RuntimeException("Não tem nenhum número");
		
	}
	
	public int encontrarMaiorNumero() {
		int maior = Integer.MIN_VALUE; // menor valor possível
		if(!listNumeros.isEmpty()) {
			for(Numeros n : listNumeros) {
				if(n.getNumeros() > maior) {
					maior = n.getNumeros();
				}
			}
			return maior;
		}
		throw new RuntimeException("Não tem nenhum número");
	}
	
	public int encontrarMenorNumero() {
		if(!listNumeros.isEmpty()) {
			int menor = listNumeros.get(0).getNumeros();
			for(Numeros n : listNumeros) {
				if(n.getNumeros() < menor) {
					menor = n.getNumeros();
				}
				
			}
			return menor;
		}
		throw new RuntimeException("Não tem nenhum número");
	}
	
	
	public List<Numeros> exibirNumeros(){
		if(!listNumeros.isEmpty()) {
			return listNumeros;
		}
		throw new RuntimeException("Não tem nenhum número");
	}
	

	public static void main(String[] args) {
		SomaNumeros soma = new SomaNumeros();
		
		soma.adicionarNumero(10);
		soma.adicionarNumero(6);
		soma.adicionarNumero(5);
		soma.adicionarNumero(4);
		soma.adicionarNumero(3);
		soma.adicionarNumero(-8);
		
		try {
		System.out.println("A soma dos números é: " + soma.calcularSoma());
		System.out.println("O maior número é: "+soma.encontrarMaiorNumero());
		System.out.println("O menor número é: " + soma.encontrarMenorNumero());
		System.out.println(soma.exibirNumeros());
		}catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
}


