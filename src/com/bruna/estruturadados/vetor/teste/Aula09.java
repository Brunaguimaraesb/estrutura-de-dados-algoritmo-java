package com.bruna.estruturadados.vetor.teste;

import com.bruna.estruturadados.vetor.Vetor;

public class Aula09 {

	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(3);
		
		vetor.adiciona("B");
		vetor.adiciona("G");
		vetor.adiciona("D");
		vetor.adiciona("E");
		vetor.adiciona("F");
			
		System.out.println(vetor);
		
		vetor.remove(1);//remove elemento da posição 1
		
		System.out.println(vetor);//fica sobrando um F na posição 4, mas como passou o tamanho real do vetor, o elemento foi ignorado 
						
		//Removendo um elemento qualquer mas sem saber exatamente em qual posição ele está
		//utiliza o método "busca", para indicar a posição através do elemento, juntamente com o método "remove"
		System.out.println("Remover o elemento E");
		
		int pos = vetor.busca("E");
		
		if(pos >-1) {//se o elemento não existir no vetor, retorna -1
			vetor.remove(pos);
		} else {
			System.out.println("Elemento não existe no vetor.");
		}
		
		System.out.println(vetor);
	}

}


