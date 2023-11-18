package Pilha;

import Excecoes.PilhaCheiaException;
import Excecoes.PilhaVaziaException;

public interface Pilha {

    public void push (int elemento) throws PilhaCheiaException;

    public int pop() throws PilhaVaziaException;

    public int getTopo() throws  PilhaVaziaException;

    public boolean isVazia();

    public boolean isCheia();

    public void imprimir();

    public int getQuantidade();
}
