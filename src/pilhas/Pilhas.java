package pilhas;

public class Pilhas {
	
	private int[] pilha;
	private int topo = -1;
	
	public Pilhas(int quantidadeItens) {
		this.pilha = new int[quantidadeItens];
	}
	
	public void push(int valor) { //(Empilhar) adiciona valor a pilha
		if (isFull()) {
			System.out.println("Pilha cheia!");
		}else {
			topo++;
			pilha[topo] = valor;
			System.out.println("Valor empilhado!");
		}
	}
	
	public void pop() { //(Desempilhar) remove valor da pilha pelo topo
		if (isEmpty()) {
			System.out.println("Pilha vazia!");
		}else {
			topo--; //Faz de conta que retira o valor!
			System.out.println("Valor desempilhado!");
		}
	}
	
	public int top() { // retorna o topo da pilha!
		if (isEmpty()) {
			System.out.println("A pilha está vazia!");
			return -1;
		}
		return pilha[topo];
	}
	
	public boolean isFull() { // Verifica se a pilha está cheia!
		if (topo == pilha.length-1) {
			return true;
		}
		return false;
	}
	
	public boolean isEmpty() { //Verifica se a pilha está vazia!
		if (topo == -1) {
			return true;
		}
		return false;
	}
	
	public void situacaoPilha() {
		if (isEmpty()) {
			System.out.println("Pilha vazia!");
		}else {
			for (int i = 0; i <= topo; i++) {
				System.out.println(pilha[i]);
			}
		}
	}
	
}