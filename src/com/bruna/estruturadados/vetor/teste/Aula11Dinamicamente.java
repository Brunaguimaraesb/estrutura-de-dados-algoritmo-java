package com.bruna.estruturadados.vetor.teste;

import com.bruna.estruturadados.vetor.Lista;

public class Aula11Dinamicamente {
	
	public static void main(String[] args) {

		Lista<String> vetor = new Lista<String>(1);
		
		vetor.adiciona("Elemento");//só consegue passar elemento do tipo string
		//vetor.adiciona(1); //o compilador não deixa passar elementos de outro tipo sem ser string
		//vetor.adiciona(new Contato());
	}
}
