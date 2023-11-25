package FilaEstaticaEDinamica;

import Excecoes.FilaCheiaException;
import Excecoes.FilaVaziaException;

public class FilaEstatica implements Fila {
	
	private int[] array;
	private int inicio = -1;
	private int quantidade;
	
	public FilaEstatica(int tamanho) {
		array = new int[tamanho];
	}

	@Override
	public void enfileirar(int elemento) throws FilaCheiaException {
		if (isCheia()) {
			throw new FilaCheiaException();
		}
		array[quantidade] = elemento;
		inicio++;
		quantidade++;
	}

	@Override
	public int desenfileirar() throws FilaVaziaException {
		if (isVazia()) {
			throw new FilaVaziaException();
		}
		int lixo = array[0];
		for (int i = 0; i < quantidade-1; i++) {
			array[i] = array[i + 1];
		}
		inicio--;
		quantidade--;
		return lixo;
	}

	@Override
	public int quantidade() {
		return quantidade;
	}

	@Override
	public int ponteiroInicio() {
		return array[0];
	}

	@Override
	public int ponteiroFim() {
		return array[inicio];
	}

	@Override
	public boolean isCheia() {
		return quantidade == array.length;
	}

	@Override
	public boolean isVazia() {
		return quantidade == 0;
	}

	@Override
	public void imprimir() {
		System.out.print("INÍCIO ==> ");
		for (int i = 0; i < quantidade; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("<== FIM");
	}
}
