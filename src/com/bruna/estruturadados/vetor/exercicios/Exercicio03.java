package com.bruna.estruturadados.vetor.exercicios;

import com.bruna.estruturadados.vetor.Lista;

/*
 * Melhore a classe Lista e implemente o método remove(T elemento), 
 * onde sera possível remover um elemento da lista passando o mesmo
 * como parâmetro.
 */

public class Exercicio03 {

	public static void main(String[] args) {
		
		Lista<String> lista = new Lista<String>(5);
		lista.adiciona("B");
		lista.adiciona("R");
		lista.adiciona("U");
		lista.adiciona("N");
		lista.adiciona("A");		
		
		System.out.println(lista);
		
		lista.remove("B");
		
		System.out.println(lista);
		
		lista.remove("A");
		
		System.out.println(lista);
		
		lista.remove("U");
		
		System.out.println(lista);

	}

}
