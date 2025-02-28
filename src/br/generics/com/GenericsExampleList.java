package br.generics.com;

import java.awt.List;
import java.util.ArrayList;

public class GenericsExampleList {
	public static void main(String[] args) {
		//sem generics
		List listaSemGenerics = new ArrayList();
		listaSemGenerics.add("Elemento 1");
		listaSemGenerics.add(10); //adiciona qqr tipo de objeto
		
		//com generics
		List<String> listaGenerics = new ArrayList<>();
		listaGenerics.add("Elemento 1");
		listaGenerics.add("Elemento 2");
		
		//iiteração lista com generics
		for (String elemento : listaGenerics) {
			System.out.println(elemento);
		}
		
		//iteração lista sem generics (necessário cast)
		for (Object elemento: listaSemGenerics ) {
			String str = (String) elemento;
			System.out.println(str);
		}
	}

}
