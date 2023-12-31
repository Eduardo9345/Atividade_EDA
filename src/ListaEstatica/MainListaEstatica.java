package ListaEstatica;

import Excecoes.ListaCheiaException;
import Excecoes.ListaVaziaException;


public class MainListaEstatica {

	public static void main(String[] args) throws ListaVaziaException, ListaCheiaException {
		
		ListaEstatica listaEstatica = new ListaEstatica(12);

		// Sequências
		int[] sequencia_1 = {7, 60, 45, 19, 28, 37};
		int[] sequencia_2 = {41, 22, 36, 56, 17, 6};
		
		adicionarLista(listaEstatica, sequencia_1);
		adicionarLista(listaEstatica, sequencia_2);
		
		listaEstatica.imprimirLista();
		
		// Remoção
		listaEstatica.removerDoInicio();
		listaEstatica.imprimirLista();
		
		listaEstatica.removerDoFinal();
		listaEstatica.imprimirLista();
		
		listaEstatica.remover(5);
		listaEstatica.imprimirLista();
		
		// Inserção
		listaEstatica.inserirNoInicio(15);
		listaEstatica.imprimirLista();
		
		listaEstatica.inserirNoFinal(90);
		listaEstatica.imprimirLista();
		
		listaEstatica.inserir(65, 4);
		listaEstatica.imprimirLista();
		
		// Impressão
		System.out.println();
		System.out.println("Lista Final");
		listaEstatica.imprimirLista();
		System.out.println("Tamanho: " + listaEstatica.quantidadeElementos());
		System.out.println("Primeiro Elemento: " + listaEstatica.buscarElementoPeloIndice(0));
		System.out.println("Último elemento: " + listaEstatica.buscarElementoPeloIndice(listaEstatica.quantidadeElementos() - 1));
		
	}

	public static void adicionarLista(ListaEstatica listaEstatica, int[] vetor) throws ListaCheiaException {
		for(int i : vetor) {
			listaEstatica.inserirNoFinal(i);
		}
	}

}
