package FilaEstaticaEDinamica;

import Excecoes.FilaVaziaException;
import ListaDinamica.No;

public class FilaDinamica implements Fila {
	
	private No inicio;
	private No fim;
	private int quantidade;
	
	@Override
	public void enfileirar( int e) {
		No elemento = new No(e);
		
		if(!this.isVazia()) {
			fim.setProximo(elemento);
			fim = fim.getProximo();
		} else {
			inicio = elemento;
			fim = elemento;
		}
		quantidade++;
		
	}
	
	@Override
	public int desenfileirar() throws FilaVaziaException {
		if(isVazia()) {
			throw new FilaVaziaException();
		}
		No lixo = inicio;
		inicio = inicio.getProximo();
		quantidade--;
		return lixo.getDado();
	}
	
	@Override
	public void imprimir() {
		No atual = inicio;
        System.out.print("INICIO ==> ");
        while (atual != null) {
            System.out.print(atual.getDado() + " ");
            atual = atual.getProximo();
        }
        System.out.println("<== FIM");
	}
	
	@Override
	public int quantidade() {
		return quantidade;
	}
	
	@Override
	public boolean isVazia() {
		return inicio == null && fim == null;
	}
	
	@Override
	public boolean isCheia() {
		return false;
	}

	@Override
	public int ponteiroInicio() {
		return inicio.getDado();
	}

	@Override
	public int ponteiroFim() {
		return fim.getDado();
	}
}
