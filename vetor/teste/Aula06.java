package com.bruna.estruturadados.vetor.teste;

import com.bruna.estruturadados.vetor.Vetor;

public class Aula06 {

	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(10);
		
		vetor.adiciona("elemento 1"); //0
		vetor.adiciona("elemento 2"); //1
		vetor.adiciona("elemento 3"); //2

		System.out.println(vetor.busca("elemento 1")); //retorna posição 0
		
		System.out.println(vetor.busca("Elemento 1")); // retorna -1 porque elemento com letra maiuscula não existe
	
		System.out.println(vetor.busca("elemento 4")); //retorna -1 porque elemento 4 não existe
	}

}
