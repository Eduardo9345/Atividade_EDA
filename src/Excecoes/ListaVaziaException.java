package Excecoes;

public class ListaVaziaException extends Exception {
	
	public ListaVaziaException(String excecao) {
//		super(excecao);
		super.getMessage();
	}
	
	@Override
	public String getMessage() {
		return "A lista está cheia";
	}

}
