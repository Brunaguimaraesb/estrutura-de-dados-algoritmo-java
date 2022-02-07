package com.bruna.estruturadados.pilha.exercicios;

import java.util.Scanner;

import com.bruna.estruturadados.pilha.Pilha;

/*
 * Escreva um programa que leia 10 n�meros. Para cada n�mero lido,
 *  verifique e codifique de acordo com as regras a seguir:
 * - Se o n�mero for par, empilhe na chamada par;
 * - Se o n�mero for �mpar, empilhe na chamada impar;
 * - Se o n�mero for zero (0), desempilhe um elemento de cada pilha. Caso 
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
			
			System.out.println("Digite um n�mero: ");			
			int num = scan.nextInt();
						
			if(num == 0) {

			//pilha par
			Integer desempilhado = pilhaPar.desempilha();

			if(desempilhado == null) {
			System.out.println("A pilha par est� vazia!");
			}else {
			System.out.println("Desempilhando da pilha par " + desempilhado);
			}
						     
			//pilha impar			
			desempilhado = pilhaImpar.desempilha();
			
			if(desempilhado == null) {
				System.out.println("A pilha �mpar est� vazia!");
			}else {
				System.out.println("Desempilhando da pilha �mpar " + desempilhado);
				pilhaImpar.empilha(desempilhado);
			}
			
		}else if (num % 2 == 0) {				
				System.out.println("\nO n�mero � par, ent�o, empilhando o n�mero " + num + " na pilha par");
				pilhaPar.empilha(num);
			} else {				
				System.out.println("\nO n�mero � �mpar, ent�o, empilhando o n�mero " + num + " na pilha impar");
				pilhaImpar.empilha(num);				
			}
						
		}
		
		System.out.println("\nPilha par: " + pilhaPar);
		System.out.println("\nPilha impar: " + pilhaImpar);
				
		System.out.println("Desempilhando todos os n�meros da pilhar par");

		while (!pilhaPar.estaVazia()){
			System.out.println("Desempilhando da pilha par: " + pilhaPar.desempilha());
		}

		System.out.println("Desempilhando todos os n�meros da pilhar �mpar");

		while (!pilhaImpar.estaVazia()){
			System.out.println("Desempilhando da pilha impar: " + pilhaImpar.desempilha());
		}

	}

}
