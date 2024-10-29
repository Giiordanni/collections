package aula.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploHashSet {

	public static void main(String[] args) {
		
		Set<String> conjunto = new HashSet<>();
		
		conjunto.add("elemento");
		conjunto.add("elemento");
		
		
		System.out.println(conjunto);
		
		Set<Integer> numeros = new HashSet<>();
		numeros.add(2);
		numeros.add(4);
		numeros.add(3);
		numeros.add(1);
		numeros.add(4);
		numeros.add(12);
		numeros.add(19);
		numeros.add(6);
		numeros.add(40);
		numeros.add(80);
		numeros.add(48);
		numeros.add(50);
		numeros.add(9);
		
		System.out.println(numeros);
		
		//Set<Integer> numerosOrdenados = new TreeSet<>(numeros);
		//System.out.println(numerosOrdenados);
		
		
		
		

	}

}
