package com.bruna.estruturadados.vetor.exercicios;

import java.util.ArrayList;

import com.bruna.estruturadados.vetor.Lista;

/*
 * Melhore a classe Lista e implemente o m�todo limpar
 * onde todos os elementos da lista s�o removidos.
 * Esse m�todo � semelhante ao m�todo clear da classe
 * ArrayList*/

public class Exercicio05 {

	public static void main(String[] args) {
		 		
		ArrayList<String> arrayList = new ArrayList<String>(5);//capacidade 5
		arrayList.add("B");
		arrayList.add("R");
		arrayList.add("U");
		arrayList.add("N");
		arrayList.add("A");		
		
		System.out.println(arrayList);
				
		arrayList.clear();//M�todo clear remove todos os elementos
		
		System.out.println(arrayList);
		
		Lista<String> lista = new Lista <String>(5);
		lista.adiciona("B");
		lista.adiciona("R");
		lista.adiciona("U");
		lista.adiciona("N");
		lista.adiciona("A");
		
		System.out.println(lista);
		
		lista.limpar();
		
		System.out.println(lista);

	}

}
