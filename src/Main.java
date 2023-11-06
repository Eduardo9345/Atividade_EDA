
public class Main {
	public static void main(String[] args) {
		ListaOrdenadaComNoDescritor  lista = new ListaOrdenadaComNoDescritor(new No(19));

		lista.inserirOrdenado(20);
		lista.inserirOrdenado(21);
		lista.inserirOrdenado(30);
		lista.inserirOrdenado(12);
		lista.inserirOrdenado(16);
		lista.inserirOrdenado(15);
		lista.inserirOrdenado(7);
		lista.removerDoFinal();
		
		
		lista.imprimir();
	}

}
