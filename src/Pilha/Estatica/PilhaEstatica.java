package Pilha.Estatica;

import Excecoes.PilhaCheiaException;
import Excecoes.PilhaVaziaException;

public class PilhaEstatica implements Pilha{

    public int[] array;
    public int topo = -1;

    public int quantidade;

    public PilhaEstatica(int tamanho){
        array = new int[tamanho];
    }


    @Override
    public void push(int elemento) throws PilhaCheiaException {
        if(isCheia()){
            throw new PilhaCheiaException();
        }
        quantidade++;
        array[++topo] = elemento;
    }

    @Override
    public int pop() throws PilhaVaziaException {
        if(isVazia()){
            throw new PilhaVaziaException();
        }
        quantidade--;
        int lixo = array[topo--];
        return lixo;
    }

    @Override
    public int getTopo() throws PilhaVaziaException {
        return array[topo];
    }

    @Override
    public boolean isVazia() {
        return quantidade == 0;
    }

    @Override
    public boolean isCheia() {
        return quantidade == array.length;
    }

    @Override
    public void imprimir() {
        System.out.println("INICIO==========");
        System.out.println(array[topo] + " <==TOPO");
        for(int i = topo-1; i >= 0; i--){
            System.out.println(array[i]);
        }
        System.out.println("FIM=============");
    }

    @Override
    public int getQuantidade() {
        return quantidade;
    }
}
