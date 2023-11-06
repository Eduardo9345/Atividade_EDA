
public class ListaOrdenadaComNoDescritor implements Lista {
	
	private No inicio;
	private No fim;
	private int tamanho;
	
	public ListaOrdenadaComNoDescritor(No inicio) {
		this.inicio = inicio;
	}

	public No getInicio() {
		return inicio;
	}

	public No getFim() {
		return fim;
	}
	
	public int getTamanho() {
		return tamanho;
	}

	public int buscarIndex(int elemento) {
		No auxiliar = inicio;
		int contador = 0;
		while (auxiliar.getProximo() != null) {
			if (auxiliar.getDado() == elemento) {
				return contador;
			}
			contador++;
		}
		return -1;
	}

	public void inserirOrdenado(int novoDado) {
        No novoNo = new No(novoDado);

        if (inicio == null || inicio.getDado() >= novoNo.getDado()) {
            novoNo.setProximo(inicio);
            inicio = novoNo;
        } else {
            No atual = inicio;
            while (atual.getProximo() != null && atual.getProximo().getDado() < novoNo.getDado()) {
                atual = atual.getProximo();
            }
            novoNo.setProximo(atual.getProximo());
            atual.setProximo(novoNo);
        }
    }


	@Override
	public void removerDoInicio() {
		No auxiliar = inicio.getProximo();
		inicio = auxiliar;
	}

	@Override
	public void removerDoFinal() {
		No auxiliar = inicio;
		while(auxiliar != null) {
			if(auxiliar.getProximo().getProximo() == null) {
				auxiliar.setProximo(null);
			}
			auxiliar = auxiliar.getProximo();
		}
	}

	@Override
	public void remover(int indice) {
		No auxiliar = inicio;
		for(int i = 0; i <= indice; i++) {
			if(i+1 == indice) {
				auxiliar.setProximo(auxiliar.getProximo().getProximo());
			}
			auxiliar = auxiliar.getProximo();
		}
	}

	@Override
	public boolean isCheia() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isVazia() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void imprimir() {
		
	        No atual = inicio;
	        while (atual != null) {
	            System.out.print(atual.getDado() + " ");
	            atual = atual.getProximo();
	        }
	        System.out.println();
	}

	@Override
	public void inserirNoInicio(int elemento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void inserir(int elemento, int indice) {
		// TODO Auto-generated method stub
		
	}
	
}
