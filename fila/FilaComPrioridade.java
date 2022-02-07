package com.bruna.estruturadados.fila;

public class FilaComPrioridade<T> extends Fila<T>{

	public void enfileira(T elemento){ //está sobrescrevendo o método enfileira pois ele estava só adicionando no final da fila
		
		Comparable<T> chave = (Comparable<T>) elemento;
		
		int i;
		for (i=0; i<this.tamanho; i++){
			if (chave.compareTo(this.elementos[i]) < 0){
				break;
			}
		}
		this.adiciona(i, elemento);
	}
	
}
