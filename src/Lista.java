
public interface Lista {
	
	public int buscar(int elemento);
	
	public void inserirNoFinal(int elemento);
	
	public void inserirNoInicio(int elemento);
	
	public void inserir(int elemento, int indice);
	
	public void removerDoInicio();
	
	public void removerDoFinal();
	
	public void remover(int indice);
	
	public boolean isCheia();
	
	public boolean isVazia();
	
	public void imprimir();

}
