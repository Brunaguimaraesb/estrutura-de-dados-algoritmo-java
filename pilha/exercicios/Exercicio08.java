package com.bruna.estruturadados.pilha.exercicios;

import java.util.Stack;

/*
 * Usando a classe Pilha ou Stack, desenvolva um algoritmo que
 * resolva o quebra-cabeça Torre de Hanoi
 */
 public class Exercicio08 {

	public static void main(String[] args) {
		
		Stack<Integer> pilhaOriginal = new Stack<>();
		Stack<Integer> pilhaDestino = new Stack<>();
		Stack<Integer> pilhaAuxiliar = new Stack<>();

		pilhaOriginal.push(3);
		pilhaOriginal.push(2);
		pilhaOriginal.push(1);
		
		torreDeHanoi(pilhaOriginal.size(), pilhaOriginal, pilhaDestino, pilhaAuxiliar);
	}
	
	public static void torreDeHanoi(int n, Stack<Integer> pilhaOriginal, 
			Stack<Integer> pilhaDestino, Stack<Integer> pilhaAuxiliar) {
		
		if (n > 0) {
			torreDeHanoi(n-1, pilhaOriginal, pilhaAuxiliar, pilhaDestino);
			pilhaDestino.push(pilhaOriginal.pop());
			System.out.println("------");
			System.out.println("Original" + pilhaOriginal);
			System.out.println("Destino" + pilhaDestino);
			System.out.println("Auxiliar" + pilhaAuxiliar);
			torreDeHanoi(n-1, pilhaAuxiliar, pilhaDestino, pilhaOriginal);
		}
	}

}
