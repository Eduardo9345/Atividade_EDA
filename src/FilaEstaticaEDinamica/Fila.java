package FilaEstaticaEDinamica;

import Excecoes.FilaCheiaException;
import Excecoes.FilaVaziaException;

public interface Fila {

	public void enfileirar(int e) throws FilaCheiaException;
	
	public int desenfileirar() throws FilaVaziaException;
	
	public int ponteiroInicio();
	
	public int ponteiroFim();
	
	public void imprimir();
	
	public int quantidade();
	
	public boolean isVazia();
	
	public boolean isCheia();
	
}
