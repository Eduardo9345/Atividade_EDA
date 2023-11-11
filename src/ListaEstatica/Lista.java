package ListaEstatica;

import Excecoes.ListaCheiaException;

public interface Lista {

    public void inserirNoInicio(int elemento) throws ListaCheiaException;
    
    public void inserirNoFinal(int elemento) throws ListaCheiaException;
    
    public void inserir(int elemento, int indice);
    
    public int removerDoInicio();
    
    public int removerDoFinal();
    
    public int remover(int indice);

    public void imprimirLista();

    public boolean isCheia();

    public boolean isVazia();

    public int buscarElemento(int elemento);

    public int quantidadeElementos();

}
