package ListaEstatica;

public class MainListaEstatica {
	
	public static void main(String[] args) {
		
		ListaEstatica listaEstatica = new ListaEstatica();

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
		listaEstatica.imprimirLista();
		
	}
	
	public static void adicionarLista(ListaEstatica listaEstatica, int[] vetor) {
		for (int v : vetor) {
			listaEstatica.inserir(v, v);
		}
	}

}
