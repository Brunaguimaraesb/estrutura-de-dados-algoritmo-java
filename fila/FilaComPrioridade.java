package com.bruna.estruturadados.fila;

public class FilaComPrioridade<T> extends Fila<T>{

	public void enfileira(T elemento){ //est� sobrescrevendo o m�todo enfileira pois ele estava s� adicionando no final da fila
		
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
