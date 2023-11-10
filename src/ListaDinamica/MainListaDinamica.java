package ListaDinamica;

public class MainListaDinamica {
	
	public static void main(String[] args) {
		ListaOrdenadaComNoDescritor  lista = new ListaOrdenadaComNoDescritor();
		
		//Configuração
		int[] sequencia1 = {17, 83, 90, 65, 40, 13};
		int[] sequencia2 = {50, 17, 48, 22, 39, 18};
		
		addLista(lista, sequencia1);
		addLista(lista, sequencia2);
		
		lista.imprimir();
		
		//Inserção
		lista.inserirOrdenado(78);
		lista.imprimir();
		
		//Remoção do final
		lista.removerDoFinal();
		lista.imprimir();
		
		//Remover do inicio
		lista.removerDoInicio();
		lista.imprimir();
		
		//Remover com indice
		lista.remover(8);
		lista.imprimir();
		
		//Parte Descritiva
		lista.imprimirTamanho();
		lista.imprimirFim();
	}
	
	public static void addLista(ListaOrdenadaComNoDescritor l, int[] v) {
		for(int i : v) {
			l.inserirOrdenado(i);
		}
	}
}
