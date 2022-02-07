package com.bruna.estruturadados.vetor.exercicios;

import com.bruna.estruturadados.vetor.Lista;

/*
 * Melhore a classe Lista e implemente o método contém, 
 * semelhando ao método contains da classe ArrayList.
 */

public class Exercicio01 {

	public static void main(String[] args) {
		
		Lista<String> lista = new Lista<String>(1);

		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");
		
		System.out.println(lista.contem("A"));
		System.out.println(lista.contem("B"));
		System.out.println(lista.contem("D"));

	}

}
