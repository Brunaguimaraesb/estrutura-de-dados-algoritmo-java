package com.bruna.estruturadados.vetor.teste;

import com.bruna.estruturadados.vetor.Vetor;

public class Aula03 {

	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(2);
		
		
		//é utilizado quando testa a opção 2 de adicionar elementos
		/*
		try {
			vetor.adiciona("elemento 1");
			vetor.adiciona("elemento 2");
			vetor.adiciona("elemento 3");
		} catch (Exception e) {
			e.printStackTrace();
		}*/
				
		//é utilizado quando testa o booleano
		vetor.adiciona("elemento 1");
		vetor.adiciona("elemento 2");
		vetor.adiciona("elemento 3");


	}
	
}
