package br.generics.com;

import java.util.HashMap;
import java.util.Map;

public class GenericsExampleMap {

	public static void main(String[] args) {
		//exemplo sem generics
		Map mapaSemGenerics = new HashMap();
		mapaSemGenerics.put("Chave 1", 10);
		mapaSemGenerics.put("Chave 2", "valor");
		
		//exemplo com generics
		Map<String, Integer> mapaGenerics = new HashMap<>();
		mapaGenerics.put("Chave 1", 10);
		mapaGenerics.put("Chave 2", 20);
		
		//iteranção mapa com Generics
		for (Map.Entry<String, Integer> entry : mapaGenerics.entrySet()) {
			String chave = entry.getKey();
			int valor = entry.getValue();
			System.out.println("Chave: " + chave + ", Valor: " + valor);
		}

		//iteração mapa sem Generics (necessário cast)
		for (Object obj : mapaSemGenerics.entrySet()) {
			Map.Entry entry = (Map.Entry) obj;
			String chave = (String) entry.getKey();
			Object valor = entry.getValue();
			System.out.println("Chave: " + chave + ", Valor: " + valor);
		}
	}

}
