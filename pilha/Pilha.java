package com.bruna.estruturadados.pilha;

import com.bruna.estruturadados.base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T> {

	public Pilha() {
		super();
	}
	//verifica a quantidade de elementos da pilha
	public Pilha(int capacidade) {
		super(capacidade);
	}
	//adicionar um elemento na pilha
	public void empilha(T elemento) {
		super.adiciona(elemento);
	}
	//verifica/espia elemento topo da pilha
	public T topo() {
		
		if (this.estaVazia()) {
			return null;
		}
		return this.elementos[tamanho-1];
	}
	//desempilha um elemento da pilha
	public T desempilha() {
		
		if (this.estaVazia()) {
			return null;
		}
		
		/*pode ser feito desse jeito, mas para simplificar, pode colocar esse código em uma linha só
		T elemento = this.elementos[tamanho-1];
		tamanho--;
		
		return elemento;
		*/
		
		return this.elementos[--tamanho];
	}
}
