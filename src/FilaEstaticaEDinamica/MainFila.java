package FilaEstaticaEDinamica;

import Excecoes.FilaCheiaException;
import Excecoes.FilaVaziaException;

public class MainFila {

	public static void main(String[] args) throws FilaCheiaException, FilaVaziaException {

		Fila fila = new FilaEstatica(12);
		
		int[] sequencia1 = {17, 83, 90, 65, 40, 13};
		int[] sequencia2 = {50, 17, 48, 22, 39, 18};
		
		addFila(fila, sequencia1);
		addFila(fila, sequencia2);
  		
		fila.imprimir();
		
		fila.desenfileirar();
		fila.imprimir();

		fila.enfileirar(12);
		fila.imprimir();
		
		fila.desenfileirar();
		fila.imprimir();
		
		fila.enfileirar(34);
		fila.imprimir();
		
		fila.desenfileirar();
		fila.imprimir();
		
		System.out.println();
		System.out.println("Elemento no inicio: " + fila.ponteiroInicio());
		System.out.println("Elemento no fim: " + fila.ponteiroFim());
		System.out.println("\nTamanho da fila: " + fila.quantidade());
}
	
	public static void addFila(Fila l, int[] v) throws FilaCheiaException {
		for(int i : v) {
			l.enfileirar(i);
		}
	}
}
