package PilhaEstaticaEDinamica;

public class PilhaNo {
	public int dado;
	public PilhaNo proximo;
	
	public PilhaNo(int dado) {
		this.dado = dado;
	}

	public int getDado() {
		return dado;
	}

	public void setDado(int dado) {
		this.dado = dado;
	}

	public PilhaNo getProximo() {
		return proximo;
	}

	public void setProximo(PilhaNo proximo) {
		this.proximo = proximo;
	}
	
}
