package PilhaEstaticaEDinamica;

import Excecoes.PilhaVaziaException;

public class PilhaDinamica implements Pilha {
	
	private PilhaNo topo;
	private int quantidade;
	
	@Override
	public void push(int elemento) {
		PilhaNo no = new PilhaNo(elemento);
		no.proximo = topo;
		topo = no;
		quantidade++;
	}

	@Override
	public int pop() throws PilhaVaziaException {
		if (isVazia()) {
			throw new PilhaVaziaException();
		}
		PilhaNo lixo = topo;
		topo = topo.proximo;
		quantidade--;
		return lixo.dado;
	}

	@Override
	public int getTopo() throws PilhaVaziaException {
		if (isVazia()) {
			throw new PilhaVaziaException();
		}
		return topo.dado;
	}

	@Override
	public boolean isVazia() {
		return topo == null;
	}

	@Override
	public boolean isCheia() {
		return false;
	}

	@Override
	public void imprimir() {
		System.out.print("INICIO ==> ");
		PilhaNo atual = topo;
		while (atual != null) {
			System.out.print(atual.dado + " ");
			atual = atual.proximo;
		}
		System.out.println("<== FIM");
	}

	@Override
	public int getQuantidade() {
		return quantidade;
	}
	
}
