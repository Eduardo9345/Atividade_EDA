package ListaEstatica;

import Excecoes.ListaCheiaException;
import Excecoes.ListaVaziaException;

public class MainListaEstatica {
	
	public static void main(String[] args) throws ListaCheiaException, ListaVaziaException {
		
		ListaEstatica listaEstatica = new ListaEstatica(12);

		// Sequências
		int[] sequencia_1 = {7, 60, 45, 19, 28, 37};
		int[] sequencia_2 = {41, 22, 36, 56, 17, 6};
		
		adicionarLista(listaEstatica, sequencia_1);
		adicionarLista(listaEstatica, sequencia_2);
		
		listaEstatica.imprimirLista();
		
		// Inserção
		listaEstatica.inserirNoInicio(15);
		listaEstatica.imprimirLista();
		
		listaEstatica.inserirNoFinal(90);
		listaEstatica.imprimirLista();
		
		listaEstatica.inserir(65, 4);
		listaEstatica.imprimirLista();
		
		// Remoção
		listaEstatica.removerDoInicio();
		listaEstatica.imprimirLista();
		
		listaEstatica.removerDoFinal();
		listaEstatica.imprimirLista();
		
		listaEstatica.remover(5);
		listaEstatica.imprimirLista();
		
		// Impressão
		System.out.println("Agora que terminou...");
		System.out.println("Lista Final");
		listaEstatica.imprimirLista();
		System.out.println("Tamanho: " + listaEstatica.quantidadeElementos());
		System.out.println("Primeiro Elemento: " + listaEstatica.buscarElemento(listaEstatica.quantidadeElementos()));
		System.out.println("Último elemento: " + listaEstatica.buscarElemento(listaEstatica.quantidadeElementos()));
		
	}

	public static void adicionarLista(ListaEstatica listaEstatica, int[] vetor) throws ListaCheiaException {
		for (int i = 0; i < listaEstatica.getTamanho(); i++) {
			listaEstatica.inserir(vetor[i], i);
		}
	}

}
