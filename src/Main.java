public class Main {
	public static void main(String[] args) {
		ListaOrdenadaComNoDescritor  lista = new ListaOrdenadaComNoDescritor();

		lista.inserirOrdenado(20);
		lista.inserirOrdenado(21);
		lista.inserirOrdenado(30);
		lista.inserirOrdenado(12);
		lista.inserirOrdenado(16);
		lista.inserirOrdenado(15);
		lista.inserirOrdenado(7);
		lista.inserirOrdenado(22);
		lista.imprimir();
		
		lista.removerDoFinal();
		lista.imprimir();
		lista.remover(3);
	
		lista.imprimir();
	}

}
