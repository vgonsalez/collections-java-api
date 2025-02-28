package br.generics.com;

import java.util.HashSet;
import java.util.Set;

public class GenericsExampleSet {

	public static void main(String[] args) {
		//sem Generics
		Set conjuntoSemGenerics = new HashSet();
		conjuntoSemGenerics.add("Elemento 1");
		conjuntoSemGenerics.add(10); //adiciona qqr tipo de objeto

		//com Generics
		Set<String> conjuntoGenerics = new HashSet<>();
		conjuntoGenerics.add("Elemento 1");
		conjuntoGenerics.add("Elemento 2");

		//iteração sobre cjto com Generics
		for (String elemento : conjuntoGenerics) {
			System.out.println(elemento);
		}

		//iteração sobre cjto sem Generics (necessário fazer cast)
		for (Object elemento : conjuntoSemGenerics) {
			String str = (String) elemento;
			System.out.println(str);
		}
	}
}