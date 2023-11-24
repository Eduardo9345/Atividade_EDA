package FilaEstaticaEDinamica;

public interface Fila {
	
	public void enfileirar() throws FilaCheiaException;
	public int desenfileirar() throws FilaVaziaException;
	public void imprimir();
	public int quantidade();
	public boolean isVazia();
	public boolean isCheia();
	
}
