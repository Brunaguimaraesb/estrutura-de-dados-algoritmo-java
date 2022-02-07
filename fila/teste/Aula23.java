package com.bruna.estruturadados.fila.teste;

import java.util.LinkedList;
import java.util.Queue;

public class Aula23 {

	public static void main(String[] args) {
		
		/*Interface1 c = new Classe1();
		
		c.adiciona();
		c.remove();
		c.teste();*/  //não funciona porque teste só existe na interface
		
		//API Java Queue
		Queue<Integer> fila = new LinkedList<>();
		
		fila.add(1); //enqueue de enfileirar
		fila.add(2);
		
		System.out.println(fila);
		
		System.out.println(fila.peek()); //espiar

		System.out.println(fila.remove()); //dequeue - desenfileirar 
		
		System.out.println(fila);
	}

}
