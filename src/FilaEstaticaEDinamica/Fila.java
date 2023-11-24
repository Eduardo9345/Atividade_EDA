package FilaEstaticaEDinamica;

import Excecoes.FilaCheiaException;
import Excecoes.FilaVaziaException;

public interface Fila {

	public void enfileirar(int elemento) throws FilaCheiaException;
	
	public int desenfileirar() throws FilaVaziaException;
	
	public int tamanhoFila();
	
	public int ponteiroInicio();
	
	public int ponteiroFim();
	
	public boolean isCheia();
	
	public boolean isVazia();
	
	public void imprimirFila();
	
}
