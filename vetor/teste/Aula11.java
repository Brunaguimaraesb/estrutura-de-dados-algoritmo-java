package com.bruna.estruturadados.vetor.teste;

import com.bruna.estruturadados.vetor.VetorObjetos;

public class Aula11 {
	
	public static void main(String[] args) {

		VetorObjetos vetor = new VetorObjetos(2);
		
		//consegue adicionar dois tipos diferentes no vetor: um elemento do tipo inteiro e um elemento do tipo String
		//foi possivel ter um vetor de tipos diferentes pois o Java permite isso quando declaramos um vetor de objetos
		//de acordo com conceito da estrutura de dados, só é possivel ter um vetor com elementos do mesmo tipo
		//é necessário ter uma forma genérica
		vetor.adiciona(1);
		vetor.adiciona("Elemento do tipo String");
		
		System.out.println(vetor);
	}	
}
