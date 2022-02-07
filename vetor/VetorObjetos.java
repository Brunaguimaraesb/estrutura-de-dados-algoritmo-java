package com.bruna.estruturadados.vetor;

public class VetorObjetos {
	
	//Modificamos a classe vetor, onde foi alterado de string para object e assim conseguimos utilizar mais de um tipo dentro de um mesmo vetor
	//generaliza o tipo dos elementos
	private Object[] elementos;
	private int tamanho; //atributo criado para controlar o tamanho real do vetor
	
	//construtor
	 public VetorObjetos(int capacidade){
		 this.elementos = new Object[capacidade];
		 this.tamanho = 0;
	 }
	
	//adiciona elemento no final do vetor - opção 3
	 public boolean adiciona(Object elemento){
		 this.aumentaCapacidade();
		 if(this.tamanho < this.elementos.length) {
			 this.elementos[this.tamanho] = elemento;
			 this.tamanho++;
			 return true;
		 }
		 return false;
			 		
	 }
	 
	 //adiciona elemento em qualquer posição
	 //sobrecarregar o método adiciona,modificando sua assinatura
	 //passa na função o elemento e a posição onde quer que ele seja adicionado
	 //move cada elemento que se encontra a partir da posição desejada para uma posição adiante e adiciona o novo elemento
	 // 0 1 2 3 4 5 6 = tamanho é 5
	 // B C E F G + +
	 //também pode utilizar no método o void, que não retorno
	 public boolean adiciona(int posicao, Object elemento){
		 
		if(!(posicao >= 0 && posicao < tamanho)) {
			 throw new IllegalArgumentException("Posição inválida"); //verifica se a posição que o usuario tá passando é uma posição válida
		}
		
		this.aumentaCapacidade();
		
		//mover todos os elementos
		for (int i=this.tamanho-1; i>=posicao; i--) {
			this.elementos[i+1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;
					
		return true;		 
	 }	 
	 
	 //adicionar capacidade no vetor
	 //vai ser utilizado apenas internamente na classe vetor, então pode declarar o método como privado
	 private void aumentaCapacidade() {
		 if(this.tamanho == this.elementos.length) {
			 Object[] elementosNovos = new Object[this.elementos.length*2]; //melhor forma de aumentar a capacidade do vetor- vai garantir que o vetor pode crescer mais
			 for(int i=0; i<this.elementos.length; i++) {
				 elementosNovos[i] = this.elementos[i];			 
		     }
		 this.elementos = elementosNovos;
	     }
	 }
	 
	//obtem elementos de uma posição
	 public Object busca(int posicao) {
		 if(!(posicao >= 0 && posicao < tamanho)) {
			 throw new IllegalArgumentException("Posição inválida");
		 }
		 return this.elementos[posicao];
	 }
	 		 
	//busca sequencial dentro de um vetor retornando a posição do elemento
	 public int busca(Object elemento) { // Utilizou esse método por ser mais elegante, pois retorna o número da posição do elemento
		 for (int i=0; i<this.tamanho; i++) {
			 if (this.elementos[i].equals(elemento)) {
				 return i; // posição do elemento de busca
			 }
		 }
		 return -1; //posição não existe
	 }
	 
	
	//removendo elemento de qualquer posição do vetor, movendo os elementos restantes para posição anterior
	//B G D E F -> posição a ser removida é a 1 = (G)
	//0 1 2 3 4 -> tamanho real é 5
	//vetor[1] = vetor[2]
	//vetor[2] = vetor[3]
	//vetor[3] = vetor[4]
	public void remove(int posicao) {
		if(!(posicao >=0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição Inválida.");
		}
		for(int i=posicao; i<this.tamanho-1; i++) {
			this.elementos[i] = this.elementos[i+1];
		}
		this.tamanho--; //diminui o tamanho do vetor, vai passar de 5 para 4, vai desconsiderar o valor que estava em 5 inicialmente
			
		}
	 
	 //verifica tamanho(quantidade de elementos do vetor)
		public int tamanho() {
			return this.tamanho;
		}

		@Override
		//imprime elementos do vetor
		public String toString() {			
			//concatenação de strings de forma mais eficiente
			StringBuilder s = new StringBuilder();
			s.append("[");
			
			for (int i=0; i<this.tamanho-1; i++){
				s.append(this.elementos[i]);
				s.append(", ");
			  }
			  
			  if (this.tamanho>0){
				  s.append(this.elementos[this.tamanho-1]);
			  }
			  
			  s.append("]");	
			
			  return s.toString();
										
			
		}
		

}
