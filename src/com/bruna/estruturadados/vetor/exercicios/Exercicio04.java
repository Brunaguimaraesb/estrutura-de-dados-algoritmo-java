package com.bruna.estruturadados.vetor.exercicios;

import com.bruna.estruturadados.vetor.Lista;

/*
 * Melhore a classe Lista e implemente o método obtem(int posicao)
 * onde sera possivel obter o elemento dada uma posição do vetor.
 * Esse método é semelhante ao método get(int posicao) da classe
 * ArrayList*/

public class Exercicio04 {

	public static void main(String[] args) {
		
		Lista<String> lista = new Lista<String>(5);
		
		lista.adiciona("B");
		lista.adiciona("R");
		lista.adiciona("U");
		lista.adiciona("N");
		lista.adiciona("A");

		System.out.println(lista);

		System.out.println(lista.obtem(0));
		System.out.println(lista.obtem(2));
		System.out.println(lista.obtem(4));
		System.out.println(lista.obtem(6));//retorna a exceção pois não existe essa posição no vetor
		
		
		
	}

}
