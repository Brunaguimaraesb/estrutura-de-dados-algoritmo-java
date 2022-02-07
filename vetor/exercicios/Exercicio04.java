package com.bruna.estruturadados.vetor.exercicios;

import com.bruna.estruturadados.vetor.Lista;

/*
 * Melhore a classe Lista e implemente o m�todo obtem(int posicao)
 * onde sera possivel obter o elemento dada uma posi��o do vetor.
 * Esse m�todo � semelhante ao m�todo get(int posicao) da classe
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
		System.out.println(lista.obtem(6));//retorna a exce��o pois n�o existe essa posi��o no vetor
		
		
		
	}

}
