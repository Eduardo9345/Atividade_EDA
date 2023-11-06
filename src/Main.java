public class Main {
	public static void main(String[] args) {
		ListaOrdenadaComNoDescritor  lista = new ListaOrdenadaComNoDescritor();
		
		int[] sequencia1 = {17, 83, 90, 65, 40, 13};
		int[] sequencia2 = {50, 17, 48, 22, 39, 18};
		
		addLista(lista, sequencia1);
		addLista(lista, sequencia2);
		
		lista.imprimir();
		
		lista.removerDoFinal();
		lista.imprimir();
		
		lista.remover(3);
		lista.imprimir();
		lista.remover(8);
		
		lista.imprimir();
		System.out.println(lista.getTamanho());
		System.out.println(lista.getFim().getDado());
	}
	public static void addLista(ListaOrdenadaComNoDescritor l, int[] v) {
		for(int i : v) {
			l.inserirOrdenado(i);
		}
	}
}
