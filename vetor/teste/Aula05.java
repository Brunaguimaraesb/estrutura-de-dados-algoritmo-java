package com.bruna.estruturadados.vetor.teste;

import com.bruna.estruturadados.vetor.Vetor;

public class Aula05 {

	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(10);
		
		vetor.adiciona("elemento 1"); //0
		vetor.adiciona("elemento 2"); //1
		vetor.adiciona("elemento 3"); //2
		
		System.out.println(vetor.busca(3));//posi��o invalida
		System.out.println(vetor.busca(2));//posi��o v�lida: de 0 at� o tamanho real do vetor
		
	}

}
