package generics.list.ordenacao.pessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {

	List<Numeros> listNumeros ;
	
	public OrdenacaoNumeros() {
		listNumeros = new ArrayList<>();
	}
	
	public void adicionarNumero(int numero) {
		listNumeros.add(new Numeros(numero));
	}
	
	public List<Numeros> ordenarAscendente(){
		List<Numeros> ascendente = new ArrayList<>(listNumeros);
		if(!listNumeros.isEmpty()) {
			Collections.sort(ascendente);
			return ascendente;
		}
		throw new RuntimeException("Lista vazia");
	}
	
	public List<Numeros> ordenarDescendente(){
		List<Numeros> descendente = new ArrayList<>(listNumeros);
		if(!listNumeros.isEmpty()) {
			Collections.sort(descendente, Collections.reverseOrder());
			return descendente;
		}
		throw new RuntimeException("Lista vazia");
	}
	
	public static void main(String[] args) {
		OrdenacaoNumeros ordem = new OrdenacaoNumeros();	
		
		ordem.adicionarNumero(9);
		ordem.adicionarNumero(1);
		ordem.adicionarNumero(8);
		ordem.adicionarNumero(3);
		ordem.adicionarNumero(2);
		ordem.adicionarNumero(7);
		ordem.adicionarNumero(10);

		System.out.println(ordem.ordenarAscendente());
		System.out.println(ordem.ordenarDescendente());
	
	
	}
}

