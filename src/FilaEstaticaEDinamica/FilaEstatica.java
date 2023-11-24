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
		array[++inicio] = elemento;
		quantidade++;
	}

	@Override
	public int desenfileirar() throws FilaVaziaException {
		if (isVazia()) {
			throw new FilaVaziaException();
		}
		int lixo = array[array.length - 1];
		for (int i = 0; i < array.length - 1; i++) {
			array[i] = array[i + 1];
		}
		inicio--;
		quantidade--;
		return lixo;
	}

	@Override
	public int tamanhoFila() {
		return quantidade;
	}

	@Override
	public int ponteiroInicio() {
		return array[0];
	}

	@Override
	public int ponteiroFim() {
		return array[array.length - 1];
	}

	@Override
	public boolean isCheia() {
		return quantidade == array.length - 1;
	}

	@Override
	public boolean isVazia() {
		return quantidade == 0;
	}

	@Override
	public void imprimirFila() {
		System.out.print("INÍCIO ==> ");
		for (int a : array) {
			System.out.print(a + " ");
		}
		System.out.println("<== FIM");
	}
}
