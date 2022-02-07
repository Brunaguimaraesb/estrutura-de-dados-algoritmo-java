package com.bruna.estruturadados.fila.teste;

import com.bruna.estruturadados.fila.Fila;

public class Aula21 {

	public static void main(String[] args) {

		Fila<String> fila = new Fila<>();
		
		fila.enfileira("B");
		fila.enfileira("R");
		fila.enfileira("U");
		fila.enfileira("N");
		fila.enfileira("A");
		;
		
		System.out.println(fila.espiar());
		System.out.println(fila.toString());	
	}

}