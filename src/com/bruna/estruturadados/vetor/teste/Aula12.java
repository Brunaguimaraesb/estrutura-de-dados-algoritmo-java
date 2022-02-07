package com.bruna.estruturadados.vetor.teste;

import java.util.ArrayList;

public class Aula12 {
	
	//API Java ArrayList

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<String>();//E � a entidade, o tipo que vai declarar
		
		//semelhante ao m�todo "adiciona" que foi criado nas aulas anteriores
		arrayList.add("A");
		arrayList.add("C");
		
		System.out.println(arrayList);
		
		//adiciona o elemento "B" no index 1		
		arrayList.add(1, "B");
		
		System.out.println(arrayList);
		
		//utilizando o m�todo de busca utiizando o contains
		//semelhante ao m�todo de busca do tipo boolean criado nas aulas anteriores
		boolean existe = arrayList.contains("A");//retorna true or false
		if(existe) {
			System.out.println("Elemento existe no array");
		} else {
			System.out.println("Elemento n�o existe no array");
		}
		
		//semelhante ao m�todo de busca do tipo int que retorna o �ndice
		int pos = arrayList.indexOf("B");
		if(pos > -1) {
			System.out.println("Elemento existe no array" + pos);
		} else {
			System.out.println("Elemento n�o existe no array" + pos);
		}
		
		//a busca por posi��o � feita atrav�s do m�todo "get"
		System.out.println(arrayList.get(2)); //retorna o elemento C, se por acaso n�o existir a posi��o, retorna uma exce��o
		
		//metodo para remover, tem duas op��es
		arrayList.remove(0); //remove por indice
		arrayList.remove("B"); //remove por objeto
		System.out.println(arrayList);//imprime s� o elemento C, que � o que sobrou no vetor
		
		//imprime o tamanho
		System.out.println(arrayList.size());//vai sair 1 porque s� tem um elemento no vetor
				
	}

}
