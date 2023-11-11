package ListaEstatica;

public interface Lista {

    public void inserirNoInicio(int elemento);
    
    public void inserirNoFinal(int elemento);
    
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
