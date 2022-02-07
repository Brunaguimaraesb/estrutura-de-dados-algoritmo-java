package com.bruna.estruturadados.fila;

import com.bruna.estruturadados.base.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica<T>{
	
	public Fila() {
		super();
	}
	
	public Fila(int capacidade) {
		super(capacidade);
	}
	//enfileira elemento
	public void enfileira(T elemento) {
		//this.elementos[this.tamanho] = elemento;
		//this.tamanho++;

		//this.elementos[this.tamanho++] = elemento;
		
		this.adiciona(elemento); //reutilizar código
	}
	//espia o primeiro elemento da fila
	public T espiar() {
		if (this.estaVazia()) {
			return null;
		}
		return this.elementos[0];
	}
	//desenfileirar elemento da fila
	public T desenfileira() {
		
		final int POSICAO = 0;
		
		if (this.estaVazia()) {
			return null;
		}
		
		T elementoASerRemovido = this.elementos[POSICAO];
		
		this.remove(POSICAO);
				
		return elementoASerRemovido;
	}
}
