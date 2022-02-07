package com.bruna.estruturadados.vetor.teste;

import java.util.ArrayList;

public class Aula12 {
	
	//API Java ArrayList

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<String>();//E é a entidade, o tipo que vai declarar
		
		//semelhante ao método "adiciona" que foi criado nas aulas anteriores
		arrayList.add("A");
		arrayList.add("C");
		
		System.out.println(arrayList);
		
		//adiciona o elemento "B" no index 1		
		arrayList.add(1, "B");
		
		System.out.println(arrayList);
		
		//utilizando o método de busca utiizando o contains
		//semelhante ao método de busca do tipo boolean criado nas aulas anteriores
		boolean existe = arrayList.contains("A");//retorna true or false
		if(existe) {
			System.out.println("Elemento existe no array");
		} else {
			System.out.println("Elemento não existe no array");
		}
		
		//semelhante ao método de busca do tipo int que retorna o índice
		int pos = arrayList.indexOf("B");
		if(pos > -1) {
			System.out.println("Elemento existe no array" + pos);
		} else {
			System.out.println("Elemento não existe no array" + pos);
		}
		
		//a busca por posição é feita através do método "get"
		System.out.println(arrayList.get(2)); //retorna o elemento C, se por acaso não existir a posição, retorna uma exceção
		
		//metodo para remover, tem duas opções
		arrayList.remove(0); //remove por indice
		arrayList.remove("B"); //remove por objeto
		System.out.println(arrayList);//imprime só o elemento C, que é o que sobrou no vetor
		
		//imprime o tamanho
		System.out.println(arrayList.size());//vai sair 1 porque só tem um elemento no vetor
				
	}

}
