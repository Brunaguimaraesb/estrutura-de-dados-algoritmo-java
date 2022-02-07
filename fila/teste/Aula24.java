package com.bruna.estruturadados.fila.teste;

import com.bruna.estruturadados.fila.FilaComPrioridade;

public class Aula24 {

	public static void main(String[] args) {
		
		/*FilaComPrioridade<Integer> fila = new FilaComPrioridade<>();
		
		fila.enfileira(1);
		fila.enfileira(3);
		fila.enfileira(2);
		
		System.out.println(fila); //1 2 3 e não 1 3 2*/
		
		FilaComPrioridade<Paciente> fila = new FilaComPrioridade<>();
		
		fila.enfileira(new Paciente("A", 2));
		fila.enfileira(new Paciente("C", 1));
		fila.enfileira(new Paciente("B", 3));

		System.out.println(fila);
		
		System.out.println(fila.desenfileira());
		
		System.out.println(fila);
	}

}
