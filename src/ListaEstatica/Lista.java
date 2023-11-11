package ListaEstatica;

import Excecoes.ListaCheiaException;
import Excecoes.ListaVaziaException;

public interface Lista {

    public void inserirNoInicio(int elemento) throws ListaCheiaException;
    
    public void inserirNoFinal(int elemento) throws ListaCheiaException;
    
    public void inserir(int elemento, int indice) throws ListaCheiaException;
    
    public int removerDoInicio() throws ListaVaziaException;
    
    public int removerDoFinal() throws ListaVaziaException;
    
    public int remover(int indice) throws ListaVaziaException;

    public void imprimirLista();

    public boolean isCheia();

    public boolean isVazia();

    public int buscarIndiceDoElemento(int elemento);

    public int quantidadeElementos();

}
