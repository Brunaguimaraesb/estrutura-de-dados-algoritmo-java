package com.bruna.estruturadados.pilha.exercicios;

import java.util.Scanner;

import com.bruna.estruturadados.pilha.Pilha;

/*
 * Escreva um programa que leia 10 números. Para cada número lido,
 *  verifique e codifique de acordo com as regras a seguir:
 * - Se o número for par, empilhe na chamada par;
 * - Se o número for ímpar, empilhe na chamada impar;
 * - Se o número for zero (0), desempilhe um elemento de cada pilha. Caso 
 * alguma pilha esteja vazia, mostre uma mensagem de erro na tela.
 * Ao final do programa desempilhe todos os elementos das duas pilhas,
 * imprimindo-os na tela
 */

public class Exercicio02 {

	public static void main(String[] args) {
		
		Pilha<Integer> pilhaPar = new Pilha<Integer>();
		Pilha<Integer> pilhaImpar = new Pilha<Integer>();

		Scanner scan = new Scanner(System.in);
		
		for (int i=1; i<=10; i++) {
			
			System.out.println("Digite um número: ");			
			int num = scan.nextInt();
						
			if(num == 0) {

			//pilha par
			Integer desempilhado = pilhaPar.desempilha();

			if(desempilhado == null) {
			System.out.println("A pilha par está vazia!");
			}else {
			System.out.println("Desempilhando da pilha par " + desempilhado);
			}
						     
			//pilha impar			
			desempilhado = pilhaImpar.desempilha();
			
			if(desempilhado == null) {
				System.out.println("A pilha ímpar está vazia!");
			}else {
				System.out.println("Desempilhando da pilha ímpar " + desempilhado);
				pilhaImpar.empilha(desempilhado);
			}
			
		}else if (num % 2 == 0) {				
				System.out.println("\nO número é par, então, empilhando o número " + num + " na pilha par");
				pilhaPar.empilha(num);
			} else {				
				System.out.println("\nO número é ímpar, então, empilhando o número " + num + " na pilha impar");
				pilhaImpar.empilha(num);				
			}
						
		}
		
		System.out.println("\nPilha par: " + pilhaPar);
		System.out.println("\nPilha impar: " + pilhaImpar);
				
		System.out.println("Desempilhando todos os números da pilhar par");

		while (!pilhaPar.estaVazia()){
			System.out.println("Desempilhando da pilha par: " + pilhaPar.desempilha());
		}

		System.out.println("Desempilhando todos os números da pilhar ímpar");

		while (!pilhaImpar.estaVazia()){
			System.out.println("Desempilhando da pilha impar: " + pilhaImpar.desempilha());
		}

	}

}
