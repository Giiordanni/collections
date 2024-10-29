package aula.generics;

import java.util.ArrayList;
import java.util.List;

public class UsandoGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Sem o Generics");
		// Exemplo sem Generics
		List listaSemGenerics = new ArrayList();
		listaSemGenerics.add("Elemento 1");
		listaSemGenerics.add("Elemento 2");
		listaSemGenerics.add(123421); // permite adicionar qualquer tipo de objeto
		
		// Interando list sem Generics (necessário fazer o cast)
		for(Object elemento : listaSemGenerics) {
			if(elemento instanceof String) {
				String str = (String)elemento;
				System.out.println(str);
			}else if(elemento instanceof Integer) {
				Integer numero = (Integer)elemento;
				System.out.println(numero);
			}
			
		}
		System.out.println("-------------------------------------\nUsando o Generics");

		// Exemplo com Generics
		List<String> listComGenerics = new ArrayList<>();
		listComGenerics.add("Elemento 1");
		listComGenerics.add("Elemento 2");
		
		// Interando list com Generics 
		for(Object elemento : listComGenerics) {
			System.out.println(elemento);
		}
	}

}
