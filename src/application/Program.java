package application;

import pilhas.Pilhas;

public class Program {

	public static void main(String[] args) {
		
		Pilhas pilha = new Pilhas(5);
		
		pilha.situacaoPilha();
		
		pilha.push(5);
		pilha.push(15);
		pilha.push(8);
		pilha.push(2);
		pilha.push(1);
		
		System.out.println("Topo da pilha "+ pilha.top());
		System.out.println();
		System.out.println("A pilha está cheia? "+ pilha.isFull());
		
		pilha.situacaoPilha();
		
		pilha.pop();
		pilha.pop();	
		pilha.pop();
		pilha.pop();
		pilha.pop();
		pilha.pop();
		
		
		
		System.out.println("A pilha está vazia? "+pilha.isEmpty());
	}

}
