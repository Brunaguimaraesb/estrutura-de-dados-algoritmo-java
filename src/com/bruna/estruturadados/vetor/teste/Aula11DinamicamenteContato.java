package com.bruna.estruturadados.vetor.teste;

import com.bruna.estruturadados.vetor.Lista;

public class Aula11DinamicamenteContato {
	
	public static void main(String[] args) {
	
	Lista<Contato> vetor = new Lista<Contato>(1);
	
	Contato c1 = new Contato("Contato 1", "1234-4567", "contato1@email.com");
	Contato c2 = new Contato("Contato 2", "2345-6789", "contato2@email.com");
	Contato c3 = new Contato("Contato 3", "3456-7890", "contato3@email.com");
		
	vetor.adiciona(c1);
	
	System.out.println(vetor);
	}
}
