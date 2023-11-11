package ListaEstatica;

import Excecoes.ListaCheiaException;

public class ListaEstatica implements Lista {
	
	private int array[];
	private int quantidade;
	
	public ListaEstatica(int tamanho) {
		array = new int[tamanho];
	}

    @Override
    public void inserirNoInicio(int elemento) {
        
    }

    @Override
    public void inserirNoFinal(int elemento) throws ListaCheiaException {
    	if (isCheia()) {
    		throw new ListaCheiaException("A lista está cheia!");
    	}
    	array[quantidade++] = elemento;
    }

    @Override
    public void inserir(int elemento, int indice) {
    	
    }

    @Override
    public int removerDoInicio() {
        return 0;
    }

    @Override
    public int removerDoFinal() {
        return 0;
    }

    @Override
    public int remover(int indice) {
        return 0;
    }

    @Override
    public void imprimirLista() {
    }

    @Override
    public boolean isCheia() {
        return quantidade == array.length;
    }

    @Override
    public boolean isVazia() {
        return false;
    }

    @Override
    public int buscarElemento(int elemento) {
        return 0;
    }

    @Override
    public int quantidadeElementos() {
        return 0;
    }
    
}
