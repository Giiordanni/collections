package aula.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExemploArrayList {

	public static void main(String[] args) {
		
		
		// criar um array list vazio
		List<String> lista = new ArrayList<>();
		
		
		// Arrays.asList("Elemento 1", "Elemento 2", "Elemento 3")
		// Adicionar elemento de acordo com pelo índice
		lista.add(0, "0");
		lista.add("3");
		lista.add("1");
		lista.add(1, "2");
		lista.add("5");
		lista.add("9");
		lista.add("8");
		lista.add("4");
		// System.out.println("Lista antes de ordenar: " + lista);
		
		
		
		// cópia da lista inicial
		List<String> copiaList = new ArrayList<>(lista);
		// System.out.println("Copia da lista" + copiaList);
		
		//System.out.println(lista);
		
		
		// Adiciona todos os elementos presentes em uma coleção especificada no final do ArrayList
        List<String> outraLista = new ArrayList<>();
        outraLista.add("Elemento 3");
        outraLista.add("Elemento 4");
        outraLista.add("Elemento 5");
        lista.addAll(outraLista);
        System.out.println(lista);
        
        
        // remover todos os dados da outra lista dentro da lista
        // útil para quando se tem dados repetidos
        lista.removeAll(outraLista);
        System.out.println(lista);
        
        // lista.remove("3");
        //System.out.println();
        //System.out.println(lista);
        
        
        // remover o elemento especificado no índice
        //lista.remove(0);
        // System.out.println(lista);
        
        
        // remover o elemento especificado pelo nome
        lista.remove("2");
        // System.out.println(lista);
        
        
        
        List<Integer> numeros = new ArrayList<>();
        numeros.add(0, 1);
        numeros.add(5);
        numeros.add(2);
        
        // remove pelo index
        // numeros.remove(1);
        // System.out.println(numeros);
        
        // saber o indice de um elemento na lista
        System.out.println(numeros.indexOf(2));
        
        
        numeros.clear();
        // System.out.println(numeros);
        
        
        System.out.println();
     // Retorna verdadeiro se ArrayList contiver o elemento especificado
        boolean contemElemento = lista.contains("1");
        // System.out.println(contemElemento);
        
        
        //lista.clear();
        // retornar verdadeiro se a lista está vazia
        boolean vazia = lista.isEmpty();
        // System.out.println(vazia);
        
        
        
        
        // lista.add("2");
        // lista.add("3");
        // retornar a quantidade de elementops na lista
        int elementos = lista.size();
        // System.out.println(elementos);
        
        Collections.sort(lista, Collections.reverseOrder());
        System.out.println("Lista após ordenar: " + lista);
        
        
        // reverter a ordem
        // reverse order usa o comparator e nao modifica diretamente a lista
        // Collections.sort(lista, Collections.reverseOrder());
        // System.out.println("Lista após ordenar: " + lista);
        
        
	}

}
