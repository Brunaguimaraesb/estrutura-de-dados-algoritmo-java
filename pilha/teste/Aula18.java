package com.bruna.estruturadados.pilha.teste;

import java.util.Stack;

import com.bruna.estruturadados.pilha.Pilha;

public class Aula18 {

	public static void main(String[] args) {
				
		Pilha<Integer> pilha = new Pilha<Integer>();
		
		Stack<Integer> stack = new Stack<Integer>();
		
		System.out.print(stack.isEmpty());
		
		stack.push(1);
		stack.push(2);
		stack.push(3);		
		
		System.out.print(stack.isEmpty());//verifica se está vazia		
		System.out.print(stack.size());//tamanho da pilha
		System.out.print(stack);//mostra os elementos da pilha	
		System.out.print(stack.peek());	//espia a pilha	
		System.out.print(stack.pop());//desempilha
		
		System.out.print(stack);
	}

}
