package FilaEstaticaEDinamica;

import ListaDinamica.No;

public class FilaDinamica implements Fila{
	private No inicio;
	private No fim;
	private int quantidade;
	
	@Override
	public void enfileirar( int e) {
		No elemento = new No(e);
		if(fim != null) {
			fim.setProximo(elemento);
			fim = fim.getProximo();
			quantidade++;
		} else {
			inicio = elemento;
			fim = elemento;
		}
		
	}
	@Override
	public int desenfileirar() throws FilaVaziaException {
		if(isVazia()) {
			throw new FilaVaziaException();
		}
		No lixo = inicio;
		inicio = inicio.getProximo();
		return lixo.getDado();
	}
	@Override
	public void imprimir() {
		No atual = inicio;
        System.out.print("INICIO===> ");
        while (atual != null) {
            System.out.print(atual.getDado() + " ");
            atual = atual.getProximo();
        }
        System.out.println("<===FIM");
	}
	@Override
	public int quantidade() {
		// TODO Auto-generated method stub
		return quantidade;
	}
	@Override
	public boolean isVazia() {
		// TODO Auto-generated method stub
		return inicio == null;
	}
	
	@Override
	public boolean isCheia() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
