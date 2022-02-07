package com.bruna.estruturadados.fila.teste;

import com.bruna.estruturadados.fila.Fila;

public class Aula22 {

	public static void main(String[] args) {

		Fila<String> fila = new Fila<>();
		
		fila.enfileira("Bruna");
		fila.enfileira("Bianca");
		fila.enfileira("Isabela");
		fila.enfileira("João");
		
		System.out.println(fila);
		
		System.out.println(fila.desenfileira());
		
		System.out.println(fila);
		
		System.out.println(fila.desenfileira());
		
		System.out.println(fila);
	}

}
