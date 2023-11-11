package ListaEstatica;

import Excecoes.ListaCheiaException;
import Excecoes.ListaVaziaException;

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
        	array[i] = array[i - 1];
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
	    		array[i] = array[i - 1];
	    	}
	    	
	    	array[indice] = elemento;
	    	quantidade++;
    	}
    }

    @Override
    public int removerDoInicio() throws ListaVaziaException {
        if(isVazia()) {
        	throw new ListaVaziaException();
        }
        int lixo = array[0];
        for (int i = 0; i < quantidade - 1; i++) {
			array[i] = array[i + 1];
		}
        quantidade--;
        return lixo;
    }

    @Override
    public int removerDoFinal() throws ListaVaziaException {
    	if(this.isVazia()) {
    		throw new ListaVaziaException();
    	}
    	
    	int lixo = array[quantidade - 1];
        quantidade--;
        return lixo;
    }

    @Override
    public int remover(int indice) throws ListaVaziaException {
    	if(this.isVazia()) {
    		throw new ListaVaziaException();
    	}
    	
    	int lixo = array[indice];
    	
    	for(int i = indice; i < quantidade; i++) {
    		array[i] = array[i+1];
    	}
    	quantidade--;
    	
    	return lixo;
    }

    @Override
    public void imprimirLista() {
    	System.out.print("INICIO ==>");
    	for (int i = 0; i < quantidade; i++) {
    		System.out.print(array[i] + " ");
    	}
    	System.out.println("<== FINAL");
    }

    @Override
    public boolean isCheia() {
        return quantidade == this.getTamanho();
    }

    @Override
    public boolean isVazia() {
        return quantidade == 0;
    }

    @Override
    public int buscarIndiceDoElemento(int elemento) {
        for (int i = 0; i < quantidade; i++) {
        	if (array[i] == elemento) {
        		return i;
        	}
        }
        return -1;
    }
    
    public int buscarElementoPeloIndice(int index) {
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
