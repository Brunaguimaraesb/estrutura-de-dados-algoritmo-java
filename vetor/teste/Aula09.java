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
		
		vetor.remove(1);//remove elemento da posi��o 1
		
		System.out.println(vetor);//fica sobrando um F na posi��o 4, mas como passou o tamanho real do vetor, o elemento foi ignorado 
						
		//Removendo um elemento qualquer mas sem saber exatamente em qual posi��o ele est�
		//utiliza o m�todo "busca", para indicar a posi��o atrav�s do elemento, juntamente com o m�todo "remove"
		System.out.println("Remover o elemento E");
		
		int pos = vetor.busca("E");
		
		if(pos >-1) {//se o elemento n�o existir no vetor, retorna -1
			vetor.remove(pos);
		} else {
			System.out.println("Elemento n�o existe no vetor.");
		}
		
		System.out.println(vetor);
	}

}


