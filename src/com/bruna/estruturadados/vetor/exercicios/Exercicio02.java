package com.bruna.estruturadados.vetor.exercicios;

import java.util.ArrayList;

import com.bruna.estruturadados.vetor.Lista;

/*
 * Melhore a classe Lista e implemente o método ultimoIndice,
 * semelhante ao método lastIndexOf da classe ArrayList*/

public class Exercicio02 {

	public static void main(String[] args) {
				
		ArrayList<String> arrayList = new ArrayList<String>(5);//capacidade 5
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("D");
		
		System.out.println(arrayList.lastIndexOf("A"));
		
		Lista<String> lista = new Lista <String>(5);
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("D");
		
		System.out.println(lista.ultimoIndice("A"));
		
	}
}
