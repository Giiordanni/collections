package aula.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExemplo {

	public static void main(String[] args) {
		
		
		Map<String, Integer> listaTelefones = new HashMap<>();
		
		listaTelefones.put("Giordanni", 2432);
		listaTelefones.put("Giordanni 1", 434322432);
		// System.out.println(listaTelefones);
		
		//listaTelefones.clear();
		//System.out.println(listaTelefones);
		
		boolean contem = listaTelefones.containsKey("Giordanni");
		// System.out.println(contem);
		
		Integer resposta = listaTelefones.get("Giordanni 1");
		// System.out.println(resposta);
		
		Integer remover = listaTelefones.remove("Giordanni");
		System.out.println(remover);
		System.out.println(listaTelefones);
		
	}

}
