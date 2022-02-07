package com.bruna.estruturadados.fila.teste;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Aula25 {

	public static void main(String[] args) {
		
		/*Queue<Integer> filaComPrioridade = new PriorityQueue<Integer>();
		
		filaComPrioridade.add(2);
		filaComPrioridade.add(1);

		System.out.println(filaComPrioridade);*/

		

		Queue<Paciente> filaComPrioridade = new PriorityQueue<>( //Queue<Paciente> filaComPrioridade = new PriorityQueue<Paciente>();
				new Comparator<Paciente>() {
					@Override
					public int compare(Paciente p1, Paciente p2) {
						return Integer.valueOf(p1.getPrioridade()).compareTo(p2.getPrioridade());
					}
				}
		);
		
		filaComPrioridade.add(new Paciente("A", 2));
		filaComPrioridade.add(new Paciente("B", 1));
		
		System.out.println(filaComPrioridade);
	}

}
