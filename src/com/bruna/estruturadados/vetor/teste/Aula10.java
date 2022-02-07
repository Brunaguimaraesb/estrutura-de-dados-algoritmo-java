package com.bruna.estruturadados.vetor.teste;

import com.bruna.estruturadados.vetor.VetorObjetos;

public class Aula10 {

	public static void main(String[] args) {
		
		VetorObjetos vetor = new VetorObjetos(3);
		
		vetor.adiciona(3);//processo que passa primitivo para transformar em um objeto: autoboxing
		vetor.adiciona(4);
		vetor.adiciona("5");//misturando os tipos, esse é do tipo string
		
		System.out.println("Tamanho = " + vetor.tamanho());
		
		System.out.println(vetor);

	}

}
