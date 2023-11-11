package ListaEstatica;

import Excecoes.ListaCheiaException;

public class ListaEstatica implements Lista {
	
	private int array[];
	private int quantidade;
	
	public ListaEstatica(int tamanho) {
		array = new int[tamanho];
	}

    @Override
    public void inserirNoInicio(int elemento) throws ListaCheiaException {
        if(isCheia()) {
        	throw new ListaCheiaException();
        }
        
        for(int i = 0; i < quantidade; i++) {
        	int aux = array[i];
        	
        	if(i == 0) {
        		array[i] = elemento;
        	}
        	
        	array[i+1] = aux;
        }
    }

    @Override
    public void inserirNoFinal(int elemento) throws ListaCheiaException {
    	if (isCheia()) {
    		throw new ListaCheiaException();
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
        return quantidade == this.getTamanho();
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
        return quantidade;
    }
    
    public int getTamanho() {
    	return array.length;
    }
    
}
