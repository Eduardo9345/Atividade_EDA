public class ListaOrdenadaComNoDescritor implements Lista {
	private No inicio;
	private No fim;
	private int tamanho;
	
	public ListaOrdenadaComNoDescritor() {
		this.inicio = null;
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

	public No buscar(int index) {
		No auxiliar = inicio;
		int contador = 0;
		while (auxiliar != null) {
			if (contador == index) {
				return auxiliar;
			}
			auxiliar = auxiliar.getProximo();
			contador++;
		}
		return null;
	}

	public void inserirOrdenado(int novoDado) {
        No novoNo = new No(novoDado);

        if (this.isVazia() || inicio.getDado() >= novoNo.getDado()) {//Se o inicio for maior que o dado, insere depois do inicio
        	
            novoNo.setProximo(inicio);
            inicio = novoNo;
            
        } else {/*se não, testa se o próximo é nulo. Se não for, testa se o próximo é menor do que o novoDado*/
        	
            No atual = inicio;
            
            while (atual.getProximo() != null && atual.getProximo().getDado() < novoNo.getDado()) {
                atual = atual.getProximo();
            }
            
            //Se o próximo for maior que o dado, inserimos o novo dado antes do próximo e depois do atual. Assim, ordenando a lista
            novoNo.setProximo(atual.getProximo());
            atual.setProximo(novoNo);
        }
        this.tamanho ++;
        this.fim = this.buscar(tamanho - 1);
    }

	@Override
	public void removerDoInicio() {
		No auxiliar = inicio.getProximo();
		inicio = auxiliar;
		this.tamanho--;
	}

	@Override
	public void removerDoFinal() {
		No auxiliar = inicio;
		while(auxiliar != null) {
			if(auxiliar.getProximo().getProximo() == null) {
				auxiliar.setProximo(null);
				this.fim = auxiliar;
			}
			auxiliar = auxiliar.getProximo();
		}
		this.tamanho--;
	}

	@Override
	public void remover(int indice) {
		No auxiliar = inicio;
		for(int i = 0; i <= indice; i++) {
			if(auxiliar != null) { 
				if(i+1 == indice) {
					auxiliar.setProximo(auxiliar.getProximo().getProximo());
				}
				auxiliar = auxiliar.getProximo();
			}
		}
		this.tamanho--;
		this.fim = this.buscar(tamanho - 1);
	}

	@Override
	public boolean isVazia() {
		return inicio == null;
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
}
