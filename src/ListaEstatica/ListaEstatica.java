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
        if(this.isCheia()) {
        	throw new ListaCheiaException();
        }
        
        for(int i = quantidade; i > 0; i--) {
        	array[quantidade] = array[quantidade - 1];
        }
        
        array[0] = elemento;
        quantidade++;
    }

    @Override
    public void inserirNoFinal(int elemento) throws ListaCheiaException {
    	if (this.isCheia()) {
    		throw new ListaCheiaException();
    	}
    	array[quantidade++] = elemento;
    }

    @Override
    public void inserir(int elemento, int indice) throws ListaCheiaException{
    	if(this.isCheia()) {
    		throw new ListaCheiaException();
    	} else if(indice > quantidade){
    		inserirNoFinal(elemento);
    	} else {
	    	for (int i = quantidade; i > indice; i--) {
	    		array[quantidade] = array[quantidade - 1];
	    	}
	    	
	    	array[indice] = elemento;
	    	quantidade++;
    	}
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
    
    public int buscarPeloIndex(int index) {
    	for(int i = 0; i < quantidade; i++) {
    		if(i == index) {
    			return array[index];
    		}
    	}
    	return -1;
    }

    @Override
    public int quantidadeElementos() {
        return quantidade;
    }
    
    public int getTamanho() {
    	return array.length;
    }
    
}
